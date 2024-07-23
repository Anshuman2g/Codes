package basic;

import java.util.*;

public class printinglist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Node temp = a;
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
      


        fn(a);
    }
    public static void fn(Node head){
       Node temp= head;
       while(temp != null){
        System.out.println(temp.data);
        temp =temp.next;
       }
    }
}
