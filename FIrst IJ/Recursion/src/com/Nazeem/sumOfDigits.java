package com.Nazeem;
//Sum of digits in recursion

public class sumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sum(1342));
        System.out.println(prod(142));
    }

    public static int sum ( int num) {
        if(num ==0) return 0;
        int n = num %10;

        return n + sum(num /10);
    }

    public static int prod ( int num) {
        if(num%10 ==num) return num;
        int n = num %10;

        return n * prod(num /10);
    }

}
