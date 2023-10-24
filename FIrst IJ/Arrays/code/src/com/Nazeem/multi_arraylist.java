package com.Nazeem;

import java.util.ArrayList;
import java.util.Scanner;

public class multi_arraylist {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(3);

        for (int i = 0; i <5 ; i++) {
            list.add( new ArrayList< >());
        }

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <3 ; j++) {
                list.get(i).add(in.nextInt());

                System.out.println(list);
                    //Incomplete code
            }

        }
    }
}
