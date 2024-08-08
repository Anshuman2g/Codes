package Prefix;

import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
         String s = "-9/*+5346";
        Stack<String>st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            // int ascii =(int)ch;
            if(ch>='0' && ch<='9')  st.push(Character.toString(ch));
            else{
                String s1 = st.pop();
                String s2 = st.pop();
               if(ch == '-') st.push("(" +s1 + ch + s2 + ")");
               if(ch == '+') st.push("(" +s1 + ch + s2 + ")");
               if(ch == '/') st.push("(" +s1 + ch + s2 + ")");
               if(ch == '*') st.push("(" +s1 + ch + s2 + ")");
            }
        }
        System.out.println(st.peek());
    }
}
