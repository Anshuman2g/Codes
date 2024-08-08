package ArrayImplementation;

public class implement {
    public static class Stack {
        private int[] arr = new int[5];

        private int idx = 0;

        void push(int x) {
            if (idx == arr.length) {
                System.out.println("stack size is full");
                return;
            }
            arr[idx++] = x;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("empty stack");
                return Integer.MIN_VALUE;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("stack is Empty");
                return Integer.MIN_VALUE;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            if (idx == 0)
                return true;
            return false;
        }

        boolean isFull() {
            if (idx == arr.length)
                return true;
            return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("peek element");
        System.out.println(st.peek());

        System.out.println("pop");
        System.out.println(st.pop());

        System.out.println("printing");
        st.display();

        System.out.println();

        System.out.println("printing size");
        System.out.println(st.size());

        System.out.println("boolean printing ");
        System.out.println(st.isEmpty());

        System.out.println("isFull");
        System.out.println(st.isFull());

        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
    }

}
