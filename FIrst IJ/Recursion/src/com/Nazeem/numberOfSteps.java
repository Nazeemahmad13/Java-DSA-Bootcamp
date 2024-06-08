package com.Nazeem;

public class numberOfSteps {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    // Problem Description : if number is even div it by 2 , and if odd subtract it by 1 and obtain  even continue this
    // until number is reduced to zero

    public static int numberOfSteps(int num ){
        int count = 0;
        return  helper(num, count);

    }
    public static int helper(int num , int count ){
        if(num == 0) return  count;

        if( num%2 == 0){

            return helper(num/2, count+1);
        }

        return helper( num-1, count+1);
    }

    private static  boolean iseven(int num) {
//      if( num/2 == 0) return true;
        return (num/2==0);
    }


}
