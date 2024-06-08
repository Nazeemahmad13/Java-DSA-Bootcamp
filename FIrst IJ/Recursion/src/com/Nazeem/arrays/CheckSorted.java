package com.Nazeem.arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int [] arr ={2,5,4,10,15,20};
        System.out.println(sorted(arr,0));
    }


    public static boolean sorted (int [] arr, int index){
        //Base condition
        if(index== arr.length -1) return true;

        return arr[index]< arr[index+1] && sorted(arr, index+1);

    }
}