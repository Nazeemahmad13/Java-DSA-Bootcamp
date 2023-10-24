package com.Nazeem;

public class BinarySearch_in2D {
    public static void main(String[] args) {
        int [][]arr={{10,20,30,40},
                      {15,25,35,45},
                       {28,29,37,49 },
                       {33,34,38,50}};
        int target= 37;
        Binarysearch2d( arr, target);

        }


    static int []Binarysearch2d(int[][] array, int target) {
        int start = 0;
        int end = array.length - 1;  // for n*n matrics



//        while (start <= end) {
//            int mid = start +(end-start) / 2;
//
//            if (target > array[mid]) start = mid + 1;
//            else if ( target < array[mid]) end= mid -1;
//            else return mid;
//        }
        return new int{ -1,-1};
    }
}

