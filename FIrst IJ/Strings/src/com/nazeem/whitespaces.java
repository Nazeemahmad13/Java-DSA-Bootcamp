package com.nazeem;

public class whitespaces {
    public static void main(String[] args) {
        String n = "nazeem is a good boy";
        System.out.println(n);
        int space = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == ' ') {
                space++;
            }
        }
        System.out.println("No of whitespaces are:"+space);
    }
}
