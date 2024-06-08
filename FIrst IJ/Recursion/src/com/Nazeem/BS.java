package com.Nazeem;

public class BS {
    public static void main(String[] args) {
            int [] arr={ 5,15,25,33,42};
        System.out.println( binarysearch(arr,15,0, arr.length-1));
    }

    public static int binarysearch (int [] arr, int target, int s, int e){
        if(s>e) return -1;

        int mid= s + (e-s) /2;

        if(target== arr[mid]) return mid;

        if(target > arr[mid]) {
          return  binarysearch(arr, target, mid+1, e);
        }
            return  binarysearch(arr, target, s, mid-1);


    }
}
