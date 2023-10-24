package com.nazeem.Generics;

import java.util.Arrays;
import java.util.Objects;

public class Custom_GenericarrayList <T> {

    private Object[] Data;   //keeping Data and everything private so that these members can not be accessed directly
    private static int DEFAULT_SIZE = 10;   // Static : because DEFAULT_SIZE will be independent of object
    private int size=0;

    public Custom_GenericarrayList() {  //Constructor
        this.Data= new Object [DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();  // resize will occur when size== 10 before that numbers will be inserted in Data(array) normally
        }
        Data[size++]= num;  //initially it will store data at index=0  and increments on every insert
    }

    private void resize() {
        Object [] temp = new Object [ Data.length * 2];      //Creating a temporary array of size twice the length of Data(array)

        for (int i = 0; i < Data.length; i++) {
            temp[i]= Data[i];    // Copying the items of current array(Data) into new temporary array
            }
        Data=temp;    // now making Data point to temp

      /* now after the function will end the 'temp' will go out of scope and
       Data is already from outside of scope and will point to temp
       */
    }

    private boolean isfull() {
        return size== Data.length;  // initial length of array Data is DEFAULT_SIZE i.e 10
    }

    public T remove(){
        T removed = (T)Data[-- size];
        return removed;
    }

    public T get( int index){
        return (T)Data[index];
    }

    public int size(){
        return size;
    }

    public void set( int index, int value){
        Data[index]= value;
    }

    @Override
    public String toString() {   // Overriding toString() methods to print our own object
        return "Custom_arrayList{" +
                "Data=" + Arrays.toString(Data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        Custom_GenericarrayList <Integer>list = new Custom_GenericarrayList();
//        list.add(3);
//        list.add(15);
//        list.add(20);
        for (int i = 0; i < 14; i++) {
            list.add(i*2);
        }

        System.out.println(list);


        System.out.println(list);
    }
}
