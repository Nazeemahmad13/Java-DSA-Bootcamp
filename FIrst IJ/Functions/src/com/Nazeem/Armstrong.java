package com.Nazeem;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Choice \n 1. TO Check number is armstrong \n 2. To print Armstrong Series ");
        int choice = in.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the number to check armstrong:");
                int n = in.nextInt();
                System.out.println(is_Armstrong(n));
            }
            case 2 -> {
                System.out.print("Enter the number to print armstrong series:");
                int m = in.nextInt();
                print_arm(m);
            }
            default -> System.out.println("Invalid Choice");
        }
    }

//    method to check armstrong
        static boolean is_Armstrong ( int n){
            int orignal = n;
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem * rem * rem;
                n = n / 10;
            }
            return (orignal == sum);
        }
// method to print armstrong series
        static void print_arm ( int m){
            int i;
            for (i = 0; i <= m; i++) {
                if (is_Armstrong(i)) {
                    System.out.println(i + " ");
                }
            }
        }
}