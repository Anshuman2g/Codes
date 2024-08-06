package double_LL_questions;

public class PalindromeDLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean isPal(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        ListNode p1 = head;
        ListNode p2 = temp;

        while ( p1 != p2  && p1.prev == p2) {
          if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);

        a.next = b;
        a.prev = null;

        b.next = c;
        b.prev = a;

        c.next = d;
        c.prev = b;

        d.next = e;
        d.prev = c;

        e.next = f;
        e.prev = d;

        f.next = null;
        f.prev=e;

        if (isPal(a)) {
            System.out.println("double linked list is palindrome");
        } else {
            System.out.println("double linked list is not palindrome");
        }
    }
}
