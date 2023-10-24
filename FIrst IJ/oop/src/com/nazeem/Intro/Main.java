package com.nazeem;

public class Main {
    static class student{
        int rollno;
        String name;
        float marks;

        student( int no, String naam, float marak){
            this.rollno=no;
            this.name= naam;
            this.marks= marak;
        }
//      Constructor overloading

        student(){
            // Calling a constructor from another constructor
            this(0,"default",0.00f);
        }

//        student(){
//            this.rollno=4;
//            this.name="Nazeem Ahmad";
//            this.marks=80.55f;
//        }
    }
    public static void main(String[] args) {

        student student1= new student(15, "gandu", 57.66f);
        student student2 = new student();
        System.out.println( student1.rollno);
        System.out.println( student1.name);
        System.out.println( student1.marks);

        System.out.println( student2.rollno);
        System.out.println( student2.name);
        System.out.println( student2.marks);

    }
}
