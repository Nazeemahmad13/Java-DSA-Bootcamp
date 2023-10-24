package com.Nazeem;

import java.util.Scanner;

public class counting_digits {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.print("Enter the number to count digit: ");
        long n= in.nextLong();
        System.out.print("Enter the digit to count in given number: ");
        int digit= in.nextInt();
        int count=0;

        while(n>0){
            long rem= n%10;
            if( rem== digit){
                count++; }
            n= n/10;

        }

        System.out.print( "No of ocuurence of " +digit);
        System.out.print(" is " +count);


      }
}
