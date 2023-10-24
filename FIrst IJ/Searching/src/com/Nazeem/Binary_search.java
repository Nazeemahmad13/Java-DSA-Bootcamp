package com.Nazeem;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {-15,-12,-2,-1,-1, -1, 6, 6, 11, 12, 14, 20, 36, 48,556};
        int target = 0;
        int result= Binarysearch(arr, target);
        if( result == -1) System.out.println( "Element not found");
        else System.out.println( "Element is found at index number: "+result);

    }

    static int Binarysearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start +(end-start) / 2;

            if (target > array[mid]) start = mid + 1;
            else if ( target < array[mid]) end= mid -1;
            else return mid;
        }
        return -1;
    }
}
