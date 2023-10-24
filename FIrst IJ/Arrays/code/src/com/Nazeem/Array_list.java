
package com.Nazeem;

import java.util.ArrayList;

import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(10);
//          arr.add( 420);
//        arr.add( 42);
//        arr.add( 42620);
//        arr.add( 4201);
////        it can go up to more than 10 times
//        System.out.println(arr);  //internally it calls its own .toString
//
////        to check whether an element is present in list or not
//
//        System.out.println(arr.contains(41)); //returns boolean value
//        System.out.println(arr.contains(42));
//
////        To update an index in list
//
//        arr.add(4,555); //adding new element at index no
//        System.out.println(arr);
//        arr.set(4, 786);  // updating element at index no
//        System.out.println(arr);
//
//// removing an index from list
//
//        arr.remove(2);
//        System.out.println(arr);

        //Taking input

        for (int i = 0; i <6 ; i++) {
            arr.add( in.nextInt());}

//        output

        for (int i = 0; i < 6; i++) {
            System.out.println(arr.get(i)); // arr[index] syntax will not work here
        }
        }
}

