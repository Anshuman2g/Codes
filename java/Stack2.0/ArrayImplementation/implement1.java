package ArrayImplementation;

public class implement1 {
    public static class Stack{
       private int[]arr = new int[5];
       private int idx=0;

        void push(int x){
            if(idx == arr.length){
                System.out.println("cant push size is full");
                return;
            }
            arr[idx++]=x;
        }
        
        int pop(){
            if(idx == 0){
                System.out.println("stack is empty so cant pop");
                return -1;
            }
            int x = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return x;
        }

        int peek(){
            if(idx == 0){
                System.out.println("stack is empty so cant peek");
                return -1;
            }
            return arr[idx-1];
        }

        void display(){
            for(int i=0;i<idx;i++){
                System.out.println(arr[i] + " ");
            }
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }

        boolean Capacity(){
            if(idx == arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.pop();
        st.peek();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        System.out.println(st.size());

        System.out.println(st.isEmpty());

        System.out.println(st.Capacity());

        st.push(5);
    }
}
