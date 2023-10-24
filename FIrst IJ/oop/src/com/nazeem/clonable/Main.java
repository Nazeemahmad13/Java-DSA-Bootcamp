package com.nazeem.clonable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException { //since we're using clone method inside function hence it should be mentioned that something
                                                                                // inside function can throw this exception
        Man young = new Man(21, "Nazeem");
        Man old = new Man(young); //cloning of Object, Instead of this we can use Cloning Interface for this purpose

//        System.out.println(old.age);
//        System.out.println(young.age);

        //Clone is a method in object class that cn be used to make clone of the objects
        Man twin = (Man) young.clone(); // Creating clone of object 'young' we have to cast it to class 'Man' type
        System.out.println(twin.name+" "+twin.age);

    }
}
