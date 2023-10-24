package com.nazeem.abstractDemo;

public abstract class Parent {
    static int age;

    public Parent(int age) {
        this.age = age;
    }

    static void greet(){
        System.out.println("Hello i'm static method inside Abstract class");
    }

    void normal(String name){
        System.out.println("This is normal method inside Abstract class called from class: "+ name);
    }  // normal method will behave like normal that is: it will require object to sun or can be called by child classes and can be overriden

    abstract void carrer (String name );
    abstract void partner();  //Abstract methods

}
