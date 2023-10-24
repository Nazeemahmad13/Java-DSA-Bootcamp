package com.nazeem;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.println("This is Bubble sort where in every pass one element gets bubble up on its" +
                " correct position");
        int[]arr={15,3,4,6,7};
        bubble_sort(arr);
        System.out.println( Arrays.toString(arr));
    }



    static void bubble_sort( int arr[]){
          boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag=false;
            // j=length-1-i coz at every phase one item will be sorted and we dont need to check for that
            for (int j = 0; j < arr.length-1-i; j++) {
                if( arr[j]>arr[j+1]){
                    //swap if item is greater
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    // flag will be true is swapping occurs
                    flag=true;
                }
            }
            if( flag==false) break; // if no swapping occured then array is already sorted dont need to check further
        }
    }
}
