public class Variations {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
         Node a = new Node(11);
         Node b = new Node(22);
         Node c = new Node(33);
         Node d = new Node(44);
         Node e = new Node(55);
         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;
         insertAtEnd(a, 99);
         display(a);
    }

    public static void insertAtEnd(Node head,int val ){
      Node temp = new Node(val);
      Node t = head;
      while(t.next != null){
         t = t.next;
      }
      t.next=temp;
    }

    
     public static void display(Node head){
      Node temp = head;
      while(temp != null){
        System.out.println(temp.data);
        temp= temp.next;
      }
     }

    public static void recursive(Node head){
           Node temp= head;
           if(temp == null) {
            return; 
           }
           System.out.print(temp.data + " ");
           recursive(temp.next);
    }

    public static void reverse(Node head){
        Node temp = head;
        if(temp == null){
          return;
        }
        reverse(head.next);
        System.out.print(head.data + " ");
  }

  public static int length(Node head){
    int cn=0;
    Node temp = head;
    if (temp == null){
        return 0;
    }
      cn = cn+1;
      cn = cn + length(temp.next);
      return cn;
  }
}
