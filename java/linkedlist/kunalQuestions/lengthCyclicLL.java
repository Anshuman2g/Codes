import java.util.HashSet;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
} 

public class lengthCyclicLL {

     public static int size(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow == fast)
           slow = slow.next;
           fast = fast.next;
           int size=1;
           slow = slow.next;
           while(slow != fast){
            ++size;
            slow = slow.next;
           }
         return size;
     }
     
    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Create a cycle for testing: 1 -> 2 -> 3 -> 4 -> 2 ...
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = head; // Cycle here
         
        System.out.print(size(head));
    }
}

