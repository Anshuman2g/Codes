public class Implementlinkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Mylinkedlist {
        Node head = null;
        Node tail = null;

        void insertAtBegin(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAtIdx(int val, int idx) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtBegin(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("wrong idx");
                return;
            }
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        int getElementIdx(int idx) {
            if (idx < 0 || idx > size()) {
                System.out.println("wrong idx");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtIdx(int idx) {
            Node temp = head;
            if(idx == 0){
                temp=temp.next;
                return;
            }
            for (int i = 1; i < idx; i++) { 
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size() -1){        //agrrr dhyan sh pado lastttt index remove  krana hai toh  tail abhi wi uss removed index ko point kregi
                tail=temp;                // isliye tail ko temp pr point krdiya
            }
        }
        

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    }

    public static void main(String[] args) {
        Mylinkedlist ll = new Mylinkedlist();
        // ll.insertAtEnd(33);
        // ll.insertAtEnd(22);
        ll.insertAtBegin(11);
        ll.insertAtBegin(0);

        ll.insertAtIdx(999, 1);
        // ll.deleteAtIdx(0);
        // System.out.println("fetching element " + ll.getElementIdx(0));
        ll.display();
    }
}
