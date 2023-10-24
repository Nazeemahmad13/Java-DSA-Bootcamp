package com.nazeem;

import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        System.out.println("Insert at begning");
        list.insertfirst("This");
        list.display();
        System.out.println("Size of ist is:"+ list.size);

        System.out.println("Insert at last");
        list.insertlast("LinkedList");
        list.display();

        System.out.println("Insert at index");
        list.insert("is", 1);
        list.display();

        System.out.println("Insert at index");
        list.insert("Singly", 2);
        list.display();

        list.insertfirst("What is this ?");
        list.display();
        System.out.println("Size of ist is:"+ list.size);

        System.out.println("\nDeleting First node: "+ list.deletefirst());
        list.display();
        System.out.println("Size of ist is:"+ list.size);

        System.out.println("\nDeleting Last node: "+ list.deletelast());
        list.display();
        System.out.println("Size of list is: "+list.size);
        list.insertlast("Linked");
        list.insertlast("List");
        list.insertlast("It is");
        list.insertlast("Dynamic");
        list.display();
        System.out.println("Size of list is: "+list.size);

        System.out.println("\nDeleting node at index: "+ list.delete(6));
        list.display();
        System.out.println("Size of list is: "+list.size);

        System.out.println("This is recursion addition:");
        list.insertRec("this is added from recursion", 3);
        list.display();
        System.out.println("Size of list is: "+list.size);

//        DLL listt =new DLL();
//        listt.insertFirst(10);
//        listt.insertFirst(3);
//        listt.insertFirst(2);
//        listt.insertFirst(8);
//        listt.insertFirst(17);
//        listt.display();
//        System.out.println("\nLinked List in Reverse Order:");
//        listt.display  Rev();
//        System.out.println("\n");
//        listt.insertLast(15);
//        listt.insertLast(17);
//        listt.display();
//        System.out.println("Size of list is:"+listt.size);
//        listt.insert(20,2);
//        listt.display();

//         CLL list= new CLL();
//         list.insert(5);
//        list.insert(7);
//        list.insert(10);
//        list.insert(15);
//        list.insert(150);
//        list.Display();
//        list.delete(150);
//        list.Display();


    }
}