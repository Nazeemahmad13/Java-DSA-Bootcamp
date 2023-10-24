package com.Nazeem;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]= new int[6];

        for (int i = 0; i < 6 ; i++) {
            arr[i] = in.nextInt();
        }
            System.out.println(Arrays.toString(arr));
          reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void reverse( int arey[]){
           int start=0;
           int end= arey.length-1;
           while(start<end){
               swap(arey, start,end);
               start++;
               end--;
           }

        }

    static void swap(int list[], int index1,int index2)
    {
        int temp = list[ index1];
        list[index1]= list[index2];
        list[index2]= temp;
    }


}

