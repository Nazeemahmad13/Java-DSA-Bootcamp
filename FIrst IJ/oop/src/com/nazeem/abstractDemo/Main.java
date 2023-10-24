package com.nazeem.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son= new Son(30); // Creating an object of clas Son
        son.carrer("Actor"); // setting the carrier property of object son
        son.partner();

        Daughter daughter = new Daughter(18);
        daughter.carrer("Coder");
        daughter.partner();
        System.out.println(daughter.age);

        //Overriding the abstract methods for different methods as per the reference of methods

//        Parent mom=new Parent(45) {}
//        Creating object of abstract class without overriding methods is not allowed
//        Gives Error or will ask to implement and override methods

        Parent.greet(); // Static method, running independently of object
        son.normal("Son");

        Parent daughter1 = new Daughter(18);
        daughter1.carrer("Nibbi");  // using class parent as a reference for object of class Daughter
    }
}
