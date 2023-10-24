package com.nazeem.Intro;

public class WrapperclassExample {
        public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;

            Integer a = 10;
            Integer b = 20;
// Wrapper classes are final classes therefore their value will not change
            swap(a, b);
              System.out.println(a + " " + b);

//        final int bonus = 2;  //making primitive final (constant)
//        bonus = 3;

            final A kunal = new A("Kunal Kushwaha");

//        kunal = new A("new object");
            // when a non primitive is final, you cannot reassign it.

            kunal.name = "other name";  //but we can change the value



            A obje = new A("Rnadvsjhv");
            System.out.println(obje);  //prints some hash value
//   Calling default to.string() method since no to.string() method is mention inside class A
//            A obj;

//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");  //creating 1000000 obj. with same reference var.
//        }

        }

        static void swap(Integer a, Integer b) {
            Integer temp = a;
            a = b;
            b = temp;
        }

    }

    class A {
        final int num = 10;  //final items need to be initialised while declaration
        String name;

        public A(String name) {
//        System.out.println("object created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
//        finalize method performs actions on destruction of objects of class
    }


