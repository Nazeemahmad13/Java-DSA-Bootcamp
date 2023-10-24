package com.Nazeem;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch= in.next().trim().charAt(0); // .trim() removes all the extra spaces after and before the string
                                             // .charAt(0) takes character at 0th index of string
       // System.out.println( ch);
//          char ch = in.next().charAt(0);
        if( ch>='a' && ch<='z')
        {
            System.out.println("Lower Case");}
        else{
            System.out.println("Upper case");}



    }
}
