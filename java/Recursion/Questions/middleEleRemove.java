import java.util.*;
public class middleEleRemove {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        remove(st,(st.size()/2)+1);
        ArrayList<Integer>ls = new ArrayList<>();
        while(!st.isEmpty()){
            ls.add(st.pop());
        }
        System.out.println(ls);

    }
        static void remove(Stack<Integer>st,int k){
            if(k == 1){
                st.pop();
                return;
            }
            int temp=st.pop();
            remove(st,k-1);
            st.push(temp);
        }
}
