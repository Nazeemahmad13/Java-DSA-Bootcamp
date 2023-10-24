package com.Nazeem;

import java.util.Scanner;

public class celing_value {

    public static void main(String[] args) {


        int[] arr = {-15, -12, -6, 10, 20, 25, 28, 35, 38, 44, 50, 55, 57};
        Scanner in = new Scanner(System.in);
        System.out.println(arr.length);
        int target = in.nextInt();

        System.out.println(" Celing value of target element is present at "+ celing_value(arr, target));
        System.out.println(" Floor value of target element is present at "+ floor_value(arr, target));
    }

     static int celing_value(int[] arr, int target) {

        if(target > arr[arr.length-1]) return -1;
         int start=0;
         int end = arr.length -1;

          while( start<=end){
              int mid= (start+end)/2;
              if( arr[mid]==target) return mid;
              else if( target<arr[mid]) end=mid-1;
              else if ( target>arr[mid]) start=mid+1;
          }
          return start;
    }

    static int floor_value(int[] arr, int target) {

        int start=0;
        int end = arr.length -1;

        while( start<=end){
            int mid= (start+end)/2;
            if( arr[mid]==target) return mid;
            else if( target<arr[mid]) end=mid-1;
            else if ( target>arr[mid]) start=mid+1;
        }
        return end;
    }
}
