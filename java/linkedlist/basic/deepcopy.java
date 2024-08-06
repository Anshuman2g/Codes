

public class deepcopy {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
      }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

          // deep copy of the list
       Node head = a;
       Node temp = new Node(-1);
       Node temp1 = temp;
       while (head != null) {
         Node tempo = new Node(head.data);
         temp1.next = tempo;
         temp1 = tempo;
         head = head.next;
       }
   
       temp = temp.next.next;
       while (temp != null) {      //changes made in deep copy skipping first two elemetns 
         System.out.print(temp.data);
         temp = temp.next;
       }
       System.out.println();

       while (a != null) {            //changes not reflected in orignal object
         System.out.print(a.data);
         a = a.next;
       }
    }
  }
           


