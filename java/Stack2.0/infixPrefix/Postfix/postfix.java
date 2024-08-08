import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57) st.push(ch-'0');
            else{
                int val1 = st.pop();
                int val2 = st.pop();
                if(ch == '+') st.push(val2+val1);
                if(ch == '-') st.push(val2-val1);
                if(ch == '/') st.push(val2/val1);
                if(ch == '*') st.push(val2*val1);
            }
        }
        System.out.println(st.peek());
    }
}
