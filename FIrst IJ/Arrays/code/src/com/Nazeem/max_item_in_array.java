package com.Nazeem;

import java.util.ArrayList;
import java.util.Scanner;

public class max_item_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the elements:");
        ArrayList<Integer> list = new ArrayList<>(3);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println("Maximum item in list: " + maximum(list));
    }

    static int maximum(ArrayList<Integer> list) {
        int big = list.get(0);
        for (int i = 1; i < 5; i++) {
            if (list.get(i) > big) {
                big = list.get(i);
            }
        }
        return big;
    }
}
