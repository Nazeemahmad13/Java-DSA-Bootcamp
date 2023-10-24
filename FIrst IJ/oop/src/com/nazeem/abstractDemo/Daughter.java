package com.nazeem.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age); // calling the constructor of Super class i.e: Parent class
    }

    @Override
    void carrer(String name) {

        System.out.println("i want be a "+ name);
    }

    @Override
    void partner() {

    }
}
