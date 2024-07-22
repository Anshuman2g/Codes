package Xprac;
import java.util.*;
public class removeBottom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        System.out.println(st);
        Stack<Integer>st2=new Stack<>();
   
        while(st.size()>1){
            st2.push(st.pop());
        }
        st.pop();
       while(st2.size()>0){
        st.push(st2.pop());
       }
       System.out.println("stack after removing the bottom elemtns"+ st);
    }
}
