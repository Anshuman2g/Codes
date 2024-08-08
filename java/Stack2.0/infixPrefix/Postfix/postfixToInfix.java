package Postfix;

import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";   // "9-(5+3)*4/6";
        Stack<String>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<= '9') st.push(Character.toString(ch));
            else{
                String val2 = st.pop();
                String val1 = st.pop();
                if(ch == '+') st.push("(" + val1 + ch + val2 + ")");
                if(ch == '-') st.push("(" + val1 + ch + val2 + ")");
                if(ch == '/') st.push("(" + val1 + ch + val2 + ")");
                if(ch == '*') st.push("(" + val1 + ch + val2 + ")");
            }
        }
        System.out.println(st.peek());
    }
}
