package Xprac;
import java.util.*;
public class MaxNestingDepth {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
       String s = "(1)+((2))+(((3)))";
       Stack<Character>st = new Stack<>();
       int cn=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i) == '('){
           st.push(s.charAt(i));
        }
        else if(s.charAt(i)==')'){
            st.pop();
        }
        max=Math.max(max,st.size());
       }
       System.out.println(max);
    }
}
