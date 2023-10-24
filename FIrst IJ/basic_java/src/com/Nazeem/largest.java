package com.Nazeem;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        System.out.print("Enter three nunbers: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max;

//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }

        max = Math.max(c ,Math.max( a, b));
            System.out.println( max);
        }
    }

