package com.nazeem;

public class Performance_ofString {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch; // series += ch
        }
        System.out.println(series); /*here for every new concatination
        of new alphabet java is creating new object and derefrencing old ones as strings are immutable
        here so much of memory wastage is occuring */

        /*for this problem we use STRINGBUILDER
        it does not create new objects for every modification
         IT creates only one object and make modifications on it only
         */

//        goto SB file
    }
}
