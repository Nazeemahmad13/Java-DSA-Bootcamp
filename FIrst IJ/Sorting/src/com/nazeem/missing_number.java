package com.nazeem;

import java.util.Arrays;
// https://leetcode.com/problems/missing-number/
// Amazon Question


public class missing_number {
    public static void main(String[] args) {
          int []arr= {3,0,2,1};//missing not present in array
//           int []arr= {4,0,2,1};
         System.out.println( missing(arr));
    }

    static int missing(int nums[]){
        int i=0;
        while(i< nums.length){
            int correct= nums[i];
            if(nums[i]< nums.length /* incase if the no is bigger than the available index */&& nums[i]!=nums[correct]){
                swap(nums,i,correct);
            } else i++;
        }
        System.out.println(Arrays.toString(nums));
        //case1: When no is not last number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j) return j; //the index which is not containing no equal is that index no is missing number

        }
//        if the missing number is not present in array
        return nums.length;
    }
    static void swap(int arr[], int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
