package Xprac;
import java.util.*;
public class revstack {
   public static void main(String[] args) {
    Stack<Integer>st = new Stack<>();
    st.push(11);
    st.push(2);
    st.push(33);
    st.push(144);

    Stack<Integer>st2 = new Stack<>();
    while(st.size()>0){
        st2.push(st.pop());
    }
    Stack<Integer>st3=new Stack<>();
    while(st2.size()>0){
        st3.push(st2.pop());
    }
    while(st3.size()>0){
        st.push(st3.pop());
    }
    System.out.println(st);
   } 
}
