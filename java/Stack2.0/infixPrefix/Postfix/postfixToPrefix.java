package Postfix;

import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // int ascii =(int)ch;
            if(ch>='0' && ch<='9')  st.push(Character.toString(ch));
            else{
                String s2 = st.pop();
                String s1 = st.pop();
               if(ch == '-') st.push(ch + s1 + s2);
               if(ch == '+') st.push(ch + s1 + s2);
               if(ch == '/') st.push(ch + s1 + s2);
               if(ch == '*') st.push(ch + s1 + s2);
            }
        }
        System.out.println(st.peek());
    }
}
