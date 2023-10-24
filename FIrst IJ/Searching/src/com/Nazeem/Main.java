package com.Nazeem;

import java.util.Scanner;

public class Main {
// Linear search
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int arr[] = new int[8];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i <8 ; i++) {
            arr[i]= in.nextInt();}

        System.out.print("Eneter the element to search in given array: ");
        int elment= in.nextInt();

        System.out.println("Element:"+elment + " is present at index number "+ linear_search(arr, elment));
    }

    static int linear_search( int arr[], int num){

        if(arr.length==0){
            return -1;
        }

        System.out.println("***Searching linerly***");
        for (int i = 0; i < arr.length ; i++) {
            if( num == arr[i]) return i;
        }
        return -1;
    }
}
