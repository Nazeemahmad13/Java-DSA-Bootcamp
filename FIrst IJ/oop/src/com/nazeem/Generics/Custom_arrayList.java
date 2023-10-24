package com.nazeem.Generics;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;

public class Custom_arrayList {

    private int[] Data;   //keeping Data and everything private so that these members can not be accessed directly
    private static int DEFAULT_SIZE = 10;   // Static : because DEFAULT_SIZE will be independent of object
    private int size=0;

    public Custom_arrayList() {  //Constructor
        this.Data= new int [DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();  // resize will occur when size== 10 before that numbers will be inserted in Data(array) normally
        }
        Data[size++]= num;  //initially it will store data at index=0  and increments on every insert
    }

    private void resize() {
        int [] temp = new int [ Data.length * 2];      //Creating a temporary array of size twice the length of Data(array)

        for (int i = 0; i < Data.length; i++) {
            temp[i]= Data[i];    // Copying the items of current array(Data) into new temporary array
            }
        Data=temp;   // now making Data point to temp

      /* now after the function will end the 'temp' will go out of scope and
       Data is already from outside of scope and will point to temp
       */
    }

    private boolean isfull() {
        return size== Data.length;  // initial length of array Data is DEFAULT_SIZE i.e 10
    }

    public int remove(){
        int removed = Data[-- size];
        return removed;
    }

    public int get( int index){
        return Data[index];
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
        Custom_arrayList list = new Custom_arrayList();
        list.add(3);
        list.add(15);
        list.add(20);

        System.out.println(list);
    }
}
