package College_Wallah;
import java.util.*;
public class InplaceRevStack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
   
        Stack<Integer>rev= new Stack<>();
        while(st.size()>0){
            rev.push(st.pop());
        }
        Stack<Integer>st3=new Stack<>();
        while(rev.size()>0){
            st3.push(rev.pop());
        }
        while(st3.size()>0){
            st.push(st3.pop());
        }
      System.out.println(st);
    }
}
