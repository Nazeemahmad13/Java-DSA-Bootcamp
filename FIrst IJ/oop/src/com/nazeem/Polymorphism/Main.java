package com.nazeem.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape= new Shapes();
        Triangle triangle= new Triangle();
        Sqaure square = new Sqaure();

        Shapes circle= new Circle(); //Object is of Shape type but
        //it's still calling function in cricle, why??
         shape.area();

//      // Which function will be accessible defined by reference type and which will be accessed is defined by the type of obj.
        // Since, constructor is of Cricle class hence the area method is being overriden by the method present in class circle.
        //for that the area() function should be present in Shape class, else it'll show error

    }


}
