package com.nazeem.staticExample;

public class Main {

    public static void main(String[] args) {
        Human nazeem= new Human(21,"Nazeem",5000,false);
        Human ayush= new Human(20, "beta",2,false);
        Human adnan= new Human();

        System.out.println(nazeem.population);
        System.out.println(ayush.population);
        System.out.println(Human.population);
    }
}
