import java.util.ArrayList;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        rev(st);
        ArrayList<Integer>ls = new ArrayList<>();
        while(!st.isEmpty()){
            ls.add(st.pop());
        }
        System.out.println(ls);
    }
    static void rev(Stack<Integer>st){
        if(st.size() == 1){
            return;
        }
        int temp=st.pop();
        rev(st);
        insert(st,temp);
    }
    static void insert(Stack<Integer>st , int temp){
        if(st.isEmpty()){
         st.push(temp);
         return;
        }
        int ans=st.pop();
        insert(st,temp);
        st.push(ans);
        return;
    }
}
