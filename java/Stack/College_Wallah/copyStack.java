package College_Wallah;
import java.util.*;
public class copyStack {
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(11); st.push(111); st.push(1111);
        System.out.println("elemet of st are ");
        System.out.println(st);
        Stack<Integer>rev = new Stack<>();
        while(st.size()>0){
        //    int x=   st.peek();
        //    rev.push(x);
        //    st.pop(); 
 
        //    OR
        rev.push(st.pop());

        }
        System.out.println("elemtns of rev stack are");
        System.out.println(rev);

        Stack<Integer>ans= new Stack<>();
        while(rev.size()>0){
            ans.push(rev.pop());
        }
        System.out.println("our answer is");
        System.out.println(ans);
        //Remember these two given stacks would be empty now 
        System.out.println(st);
        System.out.println(rev);
    }
}
 