package College_Wallah.Practice;
import java.util.*;
public class Rev {
    public static void main(String[] args) {
        // Stack<Integer>st = new Stack<>();
        // st.push(11);
        // st.push(22);
        // st.push(33);
        // System.out.println(st);
        // Stack<Integer>st2 = new Stack<>();                //rev the stack
        // while(st.size()>0){
        //     st2.push(st.pop());
        // }
        //  Stack<Integer>st3 = new Stack<>();
        // while(st2.size()>0){
        //     st3.push(st2.pop());
        // }
        // while(st3.size()>0){
        //     st.push(st3.pop());
        // }
        // System.out.println(st);      
        // -----------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------------

        // Stack<Integer>st = new Stack<>();
        // st.push(11);
        // st.push(22);
        // st.push(33);                               //REMOVE BOTTOM ELEMENT
        // System.out.println(st);
        //  Stack<Integer>st2 = new Stack<>();    
        //  while(st.size()>1){
        //     st2.push(st.pop());
        //  }
        //  st.pop();
        //  while(st2.size()>0){
        //     st.push(st2.pop());
        //  }
        //  System.out.println(st);
         // -----------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------------

    //     Stack<Integer>st = new Stack<>();
    //    st.push(11);
    //     st.push(22);
    //     st.push(33);         
    //     st.push(44);
    //     st.push(55);
    //     st.push(66);                             
    //     System.out.println(st);
    //     int x=4;                                    //INSERT AT INDEX
    //     int z=999;
    //     Stack<Integer>st2 = new Stack<>();
    //     while(st.size()>x){
    //         st2.push(st.pop());
    //     } 
    //     st.push(z);
    //     while(st2.size()>0){
    //         st.push(st2.pop());
    //     }
    //     System.out.println(st);

        // -----------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------------
        //     Stack<Integer>st = new Stack<>();
        // st.push(11);
        // st.push(22);
        // st.push(33);         
        // st.push(44);
        // st.push(55);
        // st.push(66);                             
        // System.out.println(st);    
        //   Stack<Integer>st2 = new Stack<>();                       //ADD AT BOTTom
        // while(st.size()>0){
        //     st2.push(st.pop());
        // }
        // st.push(88888);
        // while(st2.size()>0){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
           

         // -----------------------------------------------------------------------------------------
        // ---------------------------------------------------------------------------------------------
            Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);         
        st.push(44);
        st.push(55);
        st.push(66);                             
        System.out.println(st);    
          Stack<Integer>st2 = new Stack<>();                     //Print Stack element
        while(st.size()>0){
            st2.push(st.pop());
        }
        while(st2.size()>0){
            int x = st2.pop();
            System.out.println(x);
            st.push(x);
        }
        System.out.println(st);
    }
}
