package com.Nazeem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("WELCOME \t TO \t SASTA \t CALCULATOR");

        while(true) {
            System.out.println("Press \n1.For Sum \n2. For Multiplication \n3. For Substaraction \n4. For Division");
            System.out.print("Enter the choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1 -> sum();
                case 2 -> {
                    int product = mul();
                    System.out.print("Product of the given number is: " + product);
                }
                case 3 -> {
                    System.out.print("Enter the numbers to Subtract followed by a space: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    sub(num1, num2);
                }
                case 4 -> {
                    System.out.print("Enter the numbers to Divide followed by a space: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                    int division = div(num1, num2);
                    System.out.println(" Division of the given numbers is: " + division);
                }
                default -> System.out.println("Invalid Choice");
            }

            }
        }



            // Function of type take nothing, return nothing
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.print( " Sum of given number is: " +( num1 + num2) );

    }
//      Function of type take nothing and return something

       static int mul(){
           System.out.print("Enter the numbers to mul followed by a space: ");
           Scanner in = new Scanner(System.in);
           int num1 = in.nextInt();
           int num2 = in.nextInt();
           int guda = num1* num2;
           return guda;
       }
//        Function of type takes something
//        passing the parameters

           static void sub( int num1, int num2 ){
           System.out.println(" Subtraction of the given number is: " +( num1-num2));
       }

//       Funtion of type takes something return something

         static int div( int num1, int num2 ){
             int bhag = num1/ num2;
             return bhag;

    }

}
