package com.nazeem.Polymorphism;

public class Circle extends Shapes{
    //This will run when obj of circle is created
    //hence it is overriding the parent method

    @Override // is an annotation, that is being used to check whether
    // a function is being overriden or not
    void area (){
        System.out.println("Area is pie * radius * radius" );
    }
}
