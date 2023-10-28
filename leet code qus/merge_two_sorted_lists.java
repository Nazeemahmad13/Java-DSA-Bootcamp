//  https://leetcode.com/problems/merge-two-sorted-lists/

public class merge_two_sorted_lists {

    public class LL {
        ListNode head;
        ListNode tail;
        int size;

        public LL() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }


        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {  //sort and merges two lists
            ListNode f = list1;
            ListNode s = list2;
                LL ans= new LL();
            while (f != null && s != null) {
                if (f.val <= s.val) {
                    ans.insertlast(f.val);
                    f = f.next;
                } else {
                    ans.insertlast(s.val);
                    s = s.next;
                }
            }
                while(f!=null) {
                    ans.insertlast(f.val);
                    f = f.next;
                }
                while(s!=null){
                    ans.insertlast(s.val);
                    s = s.next;
                }

            return ans.head;
        }

            public void display () {              //To print the Linked list
                if (head == null) System.out.println("Empty List");

                ListNode temp = head; //creating a temporary node to traverse over linked list
                while (temp != null) {
                    System.out.print(temp.val + " -->");
                    temp = temp.next;
                }
                System.out.println(" END");
            }

            public void insertfirst ( int data){  //insertion at front of list
                ListNode node = new ListNode(data);
                node.next = head;
                head = node;

                if (tail == null) {
                    tail = head;
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
    }


}
