import java.util.ArrayList;
import java.util.Stack;

public class sortStack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(4);
        st.push(1);

        sort(st);
        ArrayList<Integer>ls = new ArrayList<>();
        while(!st.isEmpty()){
            ls.add(st.pop());
        }
        System.out.println(ls);
    }
    static void sort(Stack<Integer>st){
        if(st.size() == 1){
            return;
        }
        int temp=st.pop();
        sort(st);
        insert(st,temp);
    }

    static void insert(Stack<Integer>st,int temp){
        if(st.isEmpty() || st.peek()<=temp){
            st.push(temp);
            return;
        }
        int val=st.pop();
        insert(st,temp);
        st.push(val);
        return;
    }
}
