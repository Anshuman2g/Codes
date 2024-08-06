package DoubleLL;

public class implement {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void display2(ListNode tail) {
        ListNode temp = tail;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.prev;
        }
    }

    public static void randomNode(ListNode random) { // task is given a random node and to print list entire elements
        ListNode temp = random;
        while (temp.prev != null) { // move the random node backwards to head so that when it reaches that postion
                                    // so we can start printing from there
            temp = temp.prev;
        }
        while (temp != null) { // now start printing from head
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode InsertAtHead(ListNode head, int val) {
        ListNode insert = new ListNode(val);
        head.prev = insert;
        insert.next = head;
        head = insert;
        return head;
    }

    public static void InsertAtTail(ListNode head, int val) {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        ListNode insert = new ListNode(val);
        temp.next = insert;
        insert.prev = temp;
    }

    public static void InsertAtIdx(ListNode head, int idx, int val) {
        ListNode temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        ListNode insert = new ListNode(val);
        insert.next = temp.next;
        temp.next.prev = insert;
        temp.next = insert;
        insert.prev = temp;
    }

    public static ListNode DeleteHead(ListNode head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    public static void DeleteTail(ListNode head) {
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.prev.next = null;
    }

    public static void DeleteAtIdx(ListNode head, int idx) {
        ListNode temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(99);
        ListNode e = new ListNode(13);

        a.next = b;
        a.prev = null;

        b.next = c;
        b.prev = a;

        c.next = d;
        c.prev = b;

        d.next = e;
        d.prev = c;

        e.next = null;
        e.prev = d;

        // display(a);

        // display2(e);

        // randomNode(c);

        // ListNode newhead = InsertAtHead(a, 1111);
        // display(newhead);

        // InsertAtTail(a, 9999);
        // display(a);

        // InsertAtIdx(a, 3, -1000);
        // display(a);

        // ListNode remHead = DeleteHead(a);
        // display(remHead);

        // DeleteTail(a);
        // display(a);

        // display(a);

        DeleteAtIdx(a, 2);
        display(a);
    }
}