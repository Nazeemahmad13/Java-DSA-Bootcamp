package com.Nazeem;

import java.util.Arrays;

public class passing_the_object {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,10};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] nums)
    {
         nums[0]= 99;
/*
         Here array is not primitive datatype, so it is passed as whole object
        in the function. Therefore, change in object via refference variable,
         changes the same object
*/
    }
}
