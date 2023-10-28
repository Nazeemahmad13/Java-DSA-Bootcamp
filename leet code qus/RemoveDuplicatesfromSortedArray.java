//https://leetcode.com/problems/remove-duplicates-from-sorted-array/


import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
      int  nums []={0,0,1,1,1,2,2,3,3,4};
            int  l=0, r =1, count=1,i=0;
            while(i != nums.length-1){

                if(nums[l]!=nums[r]){
                    nums[l+1]=nums[r];
                    count++;
                    l++; r++;
                } else r++;
                i++;
            }
        System.out.println(Arrays.toString(nums));
        System.out.println(count);

        }
}


/* SUBMITTED CODE

        class Solution {
    public int removeDuplicates(int[] nums) {
       int  l=0, r =1, count=1,i=0;
        while(i != nums.length-1){

            if(nums[l]!=nums[r]){
                nums[l+1]=nums[r];
                count++;
                l++; r++;
            } else r++;
            i++;
        }
        return count;
    }
}
         */