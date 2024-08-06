package SingleCircularLl;

public class print {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        System.out.println(temp.val);
        temp = temp.next;
        while (temp != head) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void randomNode(ListNode random) { // random node given to print all values of the node
        ListNode ran = random;
        System.out.println(ran.val);
        ListNode temp = ran.next;
        while (temp != ran) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode remHead(ListNode head) {
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        return temp;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;

        // display(a);

        // randomNode(e);

        ListNode headremoval = remHead(a);
        display(headremoval);
    }
}
