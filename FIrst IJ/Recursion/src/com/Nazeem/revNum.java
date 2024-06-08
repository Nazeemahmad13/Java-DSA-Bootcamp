package com.Nazeem;

public class revNum {

    static int sum =0;
    private static int rev1(int num){
        if(num==0) return -1;
        int rem = num % 10;
        sum = sum * 10 + rem;
        return rev1(num /10);

    }

    public static boolean isplaindorme( int num ){
        rev1(num);
        return (num== sum);
    }

    public static void main(String[] args) {
//        rev1(4321);
        System.out.println(isplaindorme(12321));
        System.out.println( sum  );
    }


}
