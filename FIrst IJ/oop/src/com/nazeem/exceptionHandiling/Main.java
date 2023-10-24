package com.nazeem.exceptionHandiling;

import com.nazeem.Generics.ArrayListt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
            String name="Nazeem";
            if(name.equals("Nazeem")){
            throw  new MyException("Name is Nazeem");}
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {  //Here Arithmetic exception is more restrictive
            System.out.println(e.getMessage());  // Hence it should be written before the less restrictive otherwise it'll get ignored
        } catch (Exception e){
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("This must be executed");
        }



    }
    public static int  divide( int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Don't divide with 0");
        }
           return a / b ;
    }
}
