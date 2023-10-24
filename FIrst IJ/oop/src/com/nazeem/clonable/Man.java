package com.nazeem.clonable;

public class Man implements Cloneable{  //Clonable allows to use Clone() method on the objects of this class
    int age;
    String name;

    public Man(Man other) {
        this.age= other.age;
        this.name =other.name;
    }

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{ //the clone method throws this exception hence it should be declared
        return super.clone();
    }

}
