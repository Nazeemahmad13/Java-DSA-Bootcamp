package com.Nazeem;

public class order_agnosticBS {
    public static void main(String[] args) {
//        int [] arr= { -15,-12,-4,0, 2,5,6,9,11,15,22,26};
        int [] arr = { 551,256,95,72,50,22,21,2,-2,-15,-65};
        int target= 2;
        int result;
        if( arr[0]< arr[arr.length-1]) result= ascending_BS( arr,target);
        else result= descending_BS(arr, target);


        if( result == -1) System.out.println( "Element not found");
        else System.out.println( "Element is found at index number: "+result);
    }


    static int ascending_BS(int[] array, int target) {
        System.out.println("Ascending Binary Search Active");
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > array[mid]) start = mid + 1;
            else if (target < array[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }


    static int descending_BS(int[] array, int target) {
        System.out.println("Descending Binary Search Active");
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) end = mid - 1 ;
            else if (target < array[mid])  start = mid + 1;
            else return mid;
        }
        return -1;
    }
}


