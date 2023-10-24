package com.Nazeem;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int n = in.nextInt();
        int a= 0;
        int b = 1;
        int count;
        System.out.print("Fibonacci series :" +a);
        for( count =2; count<=n ; count ++ )
        {
            int temp = b;
            b = b + a;
            a = temp ;
            System.out.print( "," +b);

        }




    }
}
