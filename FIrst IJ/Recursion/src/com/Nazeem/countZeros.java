package com.Nazeem;

public class countZeros {
    public static void main(String[] args) {
      int number=10308;
        System.out.println("number of zeros are:"+ count(number));
    }

    public static int count (int num ){
        return helper(num,0);
    }

    public static int helper (int num, int count ){
        if(num==0) return count;

        if(num%10 == 0) return helper(num/10,count+1);

        return helper(num/10, count);
    }


}
