package LLimplement;

public class implement {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class Stack {
        Node head = null;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
        }

        int peek() {
            if (head == null) {
                System.out.println("stack is empty so cant peek");
                return -1;
            }
            return head.val;
        }

        int pop() {
            if (head == null) {
                System.out.println("stack is empty so cant pop");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        void displayrecursive(Node head) {
            if (head == null) {
                return;
            }
            displayrecursive(head.next);
            System.out.print(head.val + " ");
        }

        void display() {
            displayrecursive(head);
            System.out.println();
        }

        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

        boolean isEmpty() {
            if (head == null)
                return true;
            return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();

        System.out.println(st.peek());
        System.out.println(st.pop());

        System.out.println(st.isEmpty());

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.peek());

        System.out.println("displaying stack in original order");
        st.display();

        System.out.println("displaying stack in reverse order");
        st.displayRev();

    }
}
