package com.Nazeem;

import java.util.Arrays;
import java.util.Scanner;

public class two_D_Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][] arr= new int[3][3];

        // Taking input in 2d array

        for (int row=0;row< arr.length; row++){  //for rows
//            for column in every row
            for (int col=0; col< arr[row].length; col++) {
                arr[row][col]= in.nextInt();
            }
        }
//        Output part
//        for (int row=0;row< arr.length; row++){  //for rows
////            for column in every row
//            for (int col=0; col< arr[row].length; col++) {
//                System.out.print( arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

}}
