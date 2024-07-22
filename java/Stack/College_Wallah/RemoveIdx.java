package College_Wallah;
import java.util.*;
public class RemoveIdx {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        System.out.println(st);
        int idx=3;
         Stack<Integer>st2 = new Stack<>();
        while(st.size()>idx){
             st2.push(st.pop());
        }
        st.pop();
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println("after changing " + st);
    }
}
 