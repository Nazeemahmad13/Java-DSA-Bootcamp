package com.Nazeem;

import java.util.Arrays;
import java.util.Scanner;

public class liner_search_in_2Darray {
    public static void main(String[] args) {
        int arr[][]= { {2,3,6} ,
                        {4,5},
                        {81, 71 ,90}
                                    };
         Scanner in = new Scanner(System.in);
         int element= in.nextInt();
        int[] ans= liner_search_2D(arr , element);
        System.out.println(" Element present at : "+ Arrays.toString( ans) + " index number");
    }

    static int [] liner_search_2D( int arr[][], int element){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j]== element){
                    return new int[] { i,j};
                }
            }
        }  return new int []{ -1,-1};
    }
}
