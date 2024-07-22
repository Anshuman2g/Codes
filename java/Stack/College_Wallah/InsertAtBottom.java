package College_Wallah;
import java.util.*;
public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        System.out.println(st);
        Stack<Integer>st2=new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        System.out.println(st);
        st.push(5);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println("the stack after adding 5 is"+ st);
    }
}
