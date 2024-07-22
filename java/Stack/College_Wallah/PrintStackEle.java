package College_Wallah;
import java.util.*;
public class PrintStackEle {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        Stack<Integer>st2 = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        while(st2.size()>0){
            int x=st2.pop();
            System.out.println(x);
            st.push(x);
        }
     System.out.println(st);   
    }
}
