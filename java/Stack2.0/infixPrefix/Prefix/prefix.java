

import java.util.Stack;

public class prefix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                st.push(ch - '0');
            } else {
                int val2 = st.pop();
                int val1 = st.pop();
                if (ch == '+')
                    st.push(val2 + val1);
                if (ch == '-')
                    st.push(val2 - val1);
                if (ch == '/')
                    st.push(val2 / val1);
                if (ch == '*')
                    st.push(val2 * val1);
            }
        }
        System.out.println(st.peek());
    }
}
