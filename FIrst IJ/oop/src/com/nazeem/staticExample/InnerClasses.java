package com.nazeem.staticExample;
import java.util.Arrays;

public class InnerClasses {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override    //overriding default toString() method
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Nazeem");
        Test b = new Test("Harsh");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}

//static class A { //outer classes can't be static
//
//}