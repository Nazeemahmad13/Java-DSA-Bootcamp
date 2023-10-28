package com.Nazeem;

public class even_digits {
    public static void main(String[] args) {
        int [] nums  ={12,345,22,6,7898};
        System.out.println( find_number(nums));

//        System.out.println(count_digit(-0));
    }

    static int find_number( int [] nums){
        int presence=0;
        for (int num: nums){
            if( is_even(count_digit(num))== true){
                presence++;
            }
        } return presence;
    }
    static int count_digit( int element){
        int count =0 ;
        if( element< 0) element = element * -1;  //for negative numbers
        if( element==0) return 1;
//
//            while(element!=0 ){
//                count++;
//                element= element/10;
//        }
//            return count;
        //to optimise the code
        return (int) (Math.log10(element)+1);
    }


    static boolean is_even( int num){
      /*  if( num%2==0){
            return true;
        }
        return false;  */
        return num %2==0;  // shortcut
        // return true if equals to zero else false
    }
}
