public class PivotIndex {

//    https://leetcode.com/problems/find-pivot-index/

    public static void main(String[] args) {
        int [] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int total=0;
        for (int val: nums) total+=val;

        int leftSum=0 ; int rightSum =0;
        for (int i = 0; i < nums.length; i++) {
            rightSum = total-nums[i]- leftSum;
            if (leftSum == rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}
