package com.Nazeem;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
        multiple(2, 3, "Kunal", "Rahul", "dxxtsbhuss");
//
    }

    static void multiple(int a, int b, String... v) {
        
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
