package College_Wallah;
import java.util.*;
public class RemvBottom {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(22);
        st.push(33);
        st.push(44);
        System.out.println(st);
        Stack<Integer>st2 = new Stack<>();
        while(st.size()>1){
            st2.push(st.pop());
        }
        st.pop();
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
