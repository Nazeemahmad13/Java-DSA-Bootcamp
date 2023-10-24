package com.nazeem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google

public class finding_all_missingNumbers {

    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(missing(arr));
    }


    static List<Integer> missing(int nums[]){
        int i=0;
        while(i< nums.length){
            int correct= nums[i]-1;
            if(/* incase if the no is bigger than the available index */nums[i]!=nums[correct]){
                swap(nums,i,correct);
            } else i++;
        }
        System.out.println(Arrays.toString(nums));

        ArrayList<Integer>ans=new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1 ) {
                ans.add(j+1);
            }
        }

        return ans;
    }
    static void swap(int arr[], int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
