package College_Wallah;
import java.util.*;
public class InsertAtIndex {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        Stack<Integer>st2= new Stack<>();
        int idx=2;
        int x=7;
        while(st.size()>=idx){
            st2.push(st.pop());
        }
        st.push(7);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
