package com.Nazeem;

import java.util.Arrays;
import java.util.Scanner;

public class Max_in_2darray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[][] arr= new int[2][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println( arr[i][j]);
            }
        }

        System.out.println("MAximum element in array: "+ max(arr));
    }

    static int max( int [][]ary){
        int max= Integer.MIN_VALUE;
        for ( int [] row:ary) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        } return max;
    }


}


