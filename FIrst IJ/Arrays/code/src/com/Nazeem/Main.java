package com.Nazeem;


import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int [] arr = new int[5];

        for( int i= 0; i< arr.length ; i++) arr[i] = in.nextInt();

//        Printing the array
//        System.out.print( Arrays.toString(arr));

//        printing using for loop
//        for( int i= 0; i< arr.length ; i++)
//            System.out.print( arr[i]+" ");

//         Printing using enhanced for loop

        for( int num: arr) //here num is a reference variable pointing to the array
            System.out.print(num+" ");
    }
}
