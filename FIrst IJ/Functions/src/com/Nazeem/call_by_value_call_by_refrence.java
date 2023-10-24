package com.Nazeem;

import java.util.Scanner;

public class call_by_value_call_by_refrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of a & b :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Value of a is:" +a);
        System.out.println("Value of b is:" +b);
        swap(a,b);
        System.out.println("Value of a after swap function :" +a);
        System.out.println("Value of b after swap function :" +b);
    }


    static void swap( int a , int b)
    {
        int temp = a;
        a=b;
        b = temp;

        System.out.println("Value of a inside swap function :" +a);
        System.out.println("Value of b inside swap function :" +b);
        // there's no call by reference exist in java for primite datatypes

    }
}
