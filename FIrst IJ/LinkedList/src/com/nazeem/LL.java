package com.nazeem;

public class LL {
    /*A linked list will have a head, a tail, and size of linked list*/
    private Node head;
    private Node tail;
     int size;

    public LL() {  //Constructor
        this.head=null;
        this.tail=null;
        this.size=0; //this set size of list to zero
        // when a new object of class LL is created
    }

    public void insertfirst(String data){  //insertion at front of list
        Node node= new Node(data);
        node.next =head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(String data) {   //insertion at end of list
        if(tail==null) {
            insertfirst(data);
            return;
        }

        Node node= new Node(data);
        tail.next =node;
        tail=node;
        size++;
    }
    
    public void insert(String data, int index ){      //insertion at an index of list
        if(index==0){
            insertfirst(data);
            return;
        }

        if(index==size){
            insertlast(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index ; i++) {
            //strating from 1 coz 0 index is already contained by temp
            temp=temp.next;
        }
        Node node = new Node( data, temp.next );
        temp.next= node;
        size++;
    }

    // insert using recursion
    public void insertRec(String data, int index) {
        head = insertRec(data, index, head); //1. What will be return will set as head
    }
    //2.as first call head is received here at argument node
    private Node insertRec(String data, int index, Node node) {
        if (index == 0) {    //4. When index=0 at that call node argument will contain node which will be pointed by newly inserted node
            Node temp = new Node(data, node);  // 5.Here data is set to the temp node and temp.next is set to node in argument
            size++;
            return temp;  //6.new node i.e temp will be returned and a setted as node.next to the one prev node (node whose call was the function when index==0) of it
        }

        //3.this will make recursive calls of method with a next node on every call until index ==0
        node.next = insertRec(data, index-1, node.next);
        //7. node.next= temp is set the node 0(prv. node)--> 0(temp) --> 0(node stored in temp.next)
        return node;
        //8. on every return the control will return and end at head and head will be returned to the very first call of function in step 1
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

     public String deletefirst(){       //Deletion at front of list
        if(head==null) System.out.println("EMPTY LIST");
        String val= head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
     }

    public String delete(int index) {            //Deletion at an index of list
        if (index == 0) {
          return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }

        Node prev = get(index - 1);
        String val = prev.next.data;

        prev.next = prev.next.next;
        size--;
        return val;
    }

     public String deletelast(){             //Deletion at end of list

        if(size<=1){
            deletefirst();
        }

         Node secondLast = get(size - 2);
         String val = tail.data;
         tail = secondLast;
         tail.next = null;
         size--;
        return val;
    }


     private Node get( int index){       //To get the reference of Node
        Node temp = head;
         for (int i = 0; i < index; i++) {
             temp=temp.next;
         }
         return temp;
     }

    public class Node{          //Class defining node
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
        }    //Constructor

        public Node(String data, Node next) {       //Constructor
            this.data = data;
            this.next = next;
        }
    }

}