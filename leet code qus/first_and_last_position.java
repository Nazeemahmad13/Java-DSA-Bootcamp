import java.util.Arrays;

public class first_and_last_position {
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        int target= 8;
        System.out.println(Arrays.toString(searchRange( arr, target)));

    }


        static int[] searchRange(int[] nums, int target) {
            int []ans={-1,-1};
            ans[0]= search( nums, target, true);
            if( ans[0]!=-1) {
                ans[1] = search(nums, target, false);
            }

            return ans;
        }

        static int search(int[] nums, int target, boolean start_index){

            int start=0;
            int end= nums.length -1;
            int mid;
            int ans=-1;
            while( start<=end){
                mid=(start+end)/2;
                if( target>nums[mid]) start= mid+1;
                else if( target<nums[mid]) end= mid-1;
                else {ans=mid;
                if( start_index) end= mid-1;
                else start= mid+1;}
            }
            return ans;
        }
}

