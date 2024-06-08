package com.Nazeem.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
//        int []arr={15, 20, 31,2,7,9};
//        System.out.println("index: "+ search(arr, 0,9));

        int [] arr={15,20,5,5,6,81};
        search2(arr,0,5);
        System.out.println(list);
    }

    public static int search(int [] arr, int index, int n){
        if(arr.length==0 || index == arr.length) return -1;

        if(arr[index]== n) return index;

        return search(arr, index+1, n);
    }

    //Linear search for multiple occurences


    static ArrayList <Integer>list = new ArrayList<>();
    public static void search2(int [] arr, int index, int n){
        if(arr.length==0 || index == arr.length) return ;

        if(arr[index]== n) list.add(index);

        search2(arr, index+1, n);
    }
}
