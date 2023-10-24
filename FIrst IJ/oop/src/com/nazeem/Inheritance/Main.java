package com.nazeem.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(23);
        Box box2= new Box(5,6,5);
        System.out.println( box1.l +" " + box1.w +" " +box1.h);

        BoxWeight box3= new BoxWeight(15,20,14,21);
        System.out.println(box3.h+" " + box3.weight);

    }

    Box b5 =new BoxWeight(15,21,14,21);

    //        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

    // there are many variables in both parent and child classes
    // you are given access to variables that are in the ref type i.e. BoxWeight
    // hence, you should have access to weight variable
    // this also means, that the ones you are trying to access should be initialised
    // but here, when the obj itself is of type parent class, how will you call the constructor of child class
    // this is why error



    BoxPrice Bax7= new BoxPrice( 5,20,500);
    // calling the BoxPrice side constructor
}
