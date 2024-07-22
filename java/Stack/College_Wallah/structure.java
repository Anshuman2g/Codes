package College_Wallah;

import java.util.*;
public class structure{
    public static void main(String[] args) {
        // ArrayList<Integer>ls = new ArrayList<>();
        // ls.add(22);
        // ls.add(22);
        // ls.add(22);
        // ls.add(22);
        // System.out.println(ls);


        Stack<Integer> st = new Stack<>();
        st.push(999);
        st.push(2);
        st.push(4);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println("size is "+ st.size());

          //To access first element in st
          while(st.size()>1){
            st.pop();
          }
          System.out.println(st.peek());
          System.out.println(st);
          System.out.println(st.isEmpty());
    }
}