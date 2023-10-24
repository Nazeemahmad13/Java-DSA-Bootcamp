package com.nazeem.Acess_mod;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Nazeem Ahmad");
        int n = obj.num;

        System.out.println(obj instanceof Object);  //checking is the object 'obj' is instance of class Object.
        // Since every user defined clss is child class of Object hence obj is instance of object class
    }
}
