package basic;

import java.util.*;

public class basic {
    public static void main(String[] args) {
        // basic Syntax------------------------------------
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // Stack<Integer> st2 = new Stack<>();
        // while (!st.isEmpty()) {
        //     st2.push(st.pop());
        // }
        // System.out.println(st2);
        // while (! st2.isEmpty()) {
        //     st.push(st2.pop());
        // }
        // System.out.println(st);
        

        //Taking Input-------------------------
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Stack<Integer> st = new Stack<>(); 
        // for(int i=1;i<=n;i++){
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);

        //bottom index insert --------------------------------
        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // while(! st.isEmpty()){
        //     st2.push(st.pop());
        // }
        // st.push(100);
        // while(!st2.isEmpty()){
        //     st.push(st2.pop());
        // }
        // System.out.println(st);

        //sout stack without using sout(st) make a function


        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // while(! st.isEmpty()){
        //     st2.push(st.pop());
        // }
        // while(!st2.isEmpty()){
        //     st.push(st2.pop());
        //     System.out.print(st.peek() + " ");
        // }
    }
}