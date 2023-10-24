package com.nazeem.Sigleton;

public class Singleton {

    private Singleton() {       //defined as private, so that this constructor can be used only in this class only


    }

    private static Singleton instance;  //Creating an instance/obj which will be returned and referenced by other objects
//     since creating new object is not allowed

    public static Singleton getInstance(){
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;

    }
}
