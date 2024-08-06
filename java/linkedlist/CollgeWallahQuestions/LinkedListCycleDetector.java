import java.util.HashSet;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
} 

public class LinkedListCycleDetector {
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode>st = new HashSet<>();
        while(head != null){
            if(st.contains(head)){
                return true;
            }
            st.add(head);
            head=head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        // Create a cycle for testing: 1 -> 2 -> 3 -> 4 -> 2 ...
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Cycle here

        // Check if there is a cycle
        boolean hasCycle = hasCycle(node1);

        // Output result
        if (hasCycle) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}
// https://leetcode.com/problems/linked-list-cycle-ii/description/