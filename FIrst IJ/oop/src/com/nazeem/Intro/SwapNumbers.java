package com.nazeem.Intro;
import java.util.Scanner;


//Swap numbers using Objects
public class SwapNumbers {
    int a, b,c;
    //function to swap two numbers
    public void swapNum(SwapNumbers stn)
    {

        System.out.println("Before Swapping a:"+stn.a +", b:"+stn.b);
        int temp;
//logic for swapping
        temp = stn.a;
        stn.a = stn.b;
        stn.b = temp;

    }
    public static void main(String args[])
    {
//creating object of the class
        SwapNumbers sn = new SwapNumbers();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        sn.a = sc.nextInt();

        System.out.print("Enter the second number: ");
        sn.b = sc.nextInt();
//function calling
        sn.swapNum(sn);
//prints result after swapping
        System.out.println("After swapping: a= " + sn.a + ", b= " + sn.b);
    }
}