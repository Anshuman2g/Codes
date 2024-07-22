package Xprac;
import java.util.*;
public class InsertAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int newno=99;
        Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        Stack<Integer>st2 = new Stack<>();
        while(st.size()>=n){
            st2.push(st.pop());
        }
        st.add(newno);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
