package com.Nazeem;

import java.util.Arrays;
import java.util.Scanner;

public class swap_in_array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int arr[]= {11,22,33,44,55};
        System.out.print("Enter the index to swap:");
        int num1= in.nextInt();
        int num2= in.nextInt();
        System.out.print("Before Swap:");
        System.out.println(Arrays.toString(arr));
        swap( arr, num1, num2 );
        System.out.println("After swap:");
        System.out.print(Arrays.toString(arr));

    }

    static void swap(int list[], int index1,int index2)
        {
          int temp = list[ index1];
            list[index1]= list[index2];
            list[index2]= temp;
    }
}
