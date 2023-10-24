package com.nazeem.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age); // calling the constructor of Super class i.e: Parent class
    }


    @Override
    void normal(String name) {  //overriding normal method
        super.normal(name);
    }

    @Override
    void carrer(String name) {
        System.out.println("i want be a "+ name);
    }

    @Override
    void partner() {
        System.out.println("i love Ashwarya");
    }

}
