package Xprac;
import java.util.*;
public class removeIdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index");
        int n = sc.nextInt();
        Stack<Integer>st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        Stack<Integer>st2= new Stack<>();
        while(st.size()>n){
            st2.push(st.pop());
        }
        st.pop();
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
