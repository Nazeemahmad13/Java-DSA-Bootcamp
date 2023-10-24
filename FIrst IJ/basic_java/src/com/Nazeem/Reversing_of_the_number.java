package com.Nazeem;

//import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Reversing_of_the_number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        long n = in.nextLong();
        System.out.print("Reverse: ");

        while(n>0){
            long rem= n%10;
            System.out.print( rem);
            n=n/10;
        }


    }
}
