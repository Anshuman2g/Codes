public class Nth_node_Findend {

        // public static Node Nnode(Node head , int idx){
        //   Node temp = head;
        //   int cn=0;
        //   while(temp!= null){
        //     cn++;
        //     temp=temp.next;
        //   }
        // int ans=cn-idx;
        //     Node temp2 = head;
        //     for(int i=1;i<ans;i++){
        //        temp2=temp2.next;
        //     }
        //     return temp2.next;
        // }

        public static Node Nnode(Node head , int idx){
          Node slow = head;
          Node fast = head;
          for(int i=1;i<=idx;i++){
            fast=fast.next;
          }
          while(fast != null){
            slow = slow.next;
            fast=fast.next;
          }
          return slow;
        }

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
        Node temp = Nnode(a , 2);
        System.out.println(temp.data);
    }
}
