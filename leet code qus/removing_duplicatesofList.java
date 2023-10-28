// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/


public class removing_duplicatesofList {

//    public class ll{
        ListNode head;
        ListNode tail;
        int size;

//        public ll() {
         public removing_duplicatesofList(){
            this.head=  null;
            this.tail= null;
            this.size=0;
        }
//    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp= head;
        while(temp.next!=null){
            if(temp.val== temp.next.val){
                temp.next= temp.next.next;
            }
            else {
                 temp=temp.next;
            }
        }
        tail=temp;
        tail.next=null;
        return head;
    }

    public void display(){              //To print the Linked list
        if(head==null) System.out.println("Empty List");

        ListNode temp= head; //creating a temporary node to traverse over linked list
        while(temp!=null){
            System.out.print(temp.val +" -->");
            temp=temp.next;
        }
        System.out.println(" END");
    }

    public void insertfirst(int data){  //insertion at front of list
        ListNode node= new ListNode(data);
        node.next =head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int data) {   //insertion at end of list
        if(tail==null) {
            insertfirst(data);
            return;
        }

        ListNode node= new ListNode(data);
        tail.next =node;
        tail=node;
        size++;
    }


    public static void main(String[] args) {
      removing_duplicatesofList ll= new removing_duplicatesofList();
      ll.insertfirst(1);
      ll.insertfirst(1);
      ll.insertfirst(1);
        ll.insertfirst(2);
        ll.insertfirst(2);
        ll.insertfirst(15);
        ll.insertfirst(15);
        ll.insertfirst(15);
        ll.display();
        ll.deleteDuplicates(ll.head);
        ll.display();

    }


}
