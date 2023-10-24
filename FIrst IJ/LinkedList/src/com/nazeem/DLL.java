package com.nazeem;

public class DLL {
    /*A linked list will have a head, a tail, and size of linked list*/
    private Node head;
    private Node tail;
    int size;

    public DLL() {
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void displayRev(){
        if(head==null) System.out.println("Empty List");
        Node temp= tail; //creating a temporary node to traverse over linked list
        while(temp!=null){
            System.out.print(temp.data +" -->");
            temp=temp.prev;
        }
        System.out.println("START");
    }


    public void insertFirst(int data){  //insertion at front of list
        Node node= new Node( data );
        node.next = head;
        node.prev= null;
        if(head!=null){
            head.prev = node;
        }
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int data){  //insertion at end of list
        if(tail==null) {
            insertFirst(data);
            return;
          }
        Node node= new Node( data );

        if(head==null){  //is head==null then we're inserting first node in list
            node.prev=null;
            head=node;
            return;
        }

        node.next = null;
        node.prev= tail;
        tail.next= node;
        tail=node;
        size++;
    }

    public void insert(int data, int index ){      //insertion at an index of list
        if(index==0){
            insertFirst(data);
            return;
        }

        if(index==size){
            insertLast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            //strating from 1 coz 0 index is already contained by temp
            temp=temp.next;
        }
        Node node = new Node(data);
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev= temp;



        size++;
    }


    public void display(){              //To print the Linked list
        if(head==null) System.out.println("Empty List");

        Node temp= head; //creating a temporary node to traverse over linked list
        while(temp!=null){
            System.out.print(temp.data +" -->");
            temp=temp.next;
        }
        System.out.println(" END");
    }

    private class Node{          //Class defining node
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
