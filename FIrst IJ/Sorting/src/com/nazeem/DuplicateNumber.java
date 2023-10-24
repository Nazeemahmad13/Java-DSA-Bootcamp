package com.nazeem;

public class DuplicateNumber {
    public static void main(String[] args) {
        int []arr={1,3,4,2,2};
        System.out.println(find(arr));
    }
    static int find(int []nums){
        int i=0;
        while(i<nums.length){
            int correct_index= nums[i]-1;
            if(nums[i]!=nums[correct_index]){
                swap(nums,i,correct_index);
            }  else{
                i++;
            }
        }

        System.out.println(nums);
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j) return j+1;
        }
//
        return nums.length;
    }

    static void swap(int arr[], int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
