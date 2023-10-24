package com.nazeem.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
//        this.population += 1;
        /* since population is static means object independent
        we can access it using class name also i.e
         */
        Human.population +=1;   //Good practice is using class name to access static properties of class instead
                                // using object name with the help of **this** keyword
    }

    public Human(){
        this.population+=1;
    }
}