package com.Nazeem;

import java.util.Arrays;

public class array_in_function {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    static void change( int[] arr){
        arr[0] = 99;
    }
//    Here change in formal argument will affect in actual arguments
//    because both are pointing on the same object.
}
