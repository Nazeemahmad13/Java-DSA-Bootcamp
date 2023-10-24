package com.Nazeem;

import java.util.Scanner;

public class Search_in_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string:");
        String name = in.next();
        System.out.print("Enter the character to search in given string: ");
        char target = in.next().charAt(0);
        System.out.println("Given string: " + name);
        System.out.println("Character to be searched:" + target);
        if( liner_search_in_string(name ,target) == -1){
            System.out.println("Character not found");
        }
        System.out.println("Given character is present in string at: "+ liner_search_in_string( name, target) +" index number");
    }

    static int liner_search_in_string(String naam, char target) {
        if (naam.length() == 0) {
            return -1;
        }

        for (int i = 0; i < naam.length(); i++) {
            if (target == naam.charAt(i)) {
                return i;
            }

        }
        return -1;
    }

}


