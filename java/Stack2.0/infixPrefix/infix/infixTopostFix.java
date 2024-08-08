import java.util.Stack;

public class infixTopostFix {
    public static void main(String[] args) {
    String s = "9-(5+3)*4/6";

    Stack<String>val = new Stack<>();
    Stack<Character> op = new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        int ascii = (int)ch;
        if(ascii>=48 && ascii<=57) val.push(Character.toString(ch));
        else if(op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
        else if(ch == ')'){
            while(op.peek() != '('){
                String s1 = val.pop();
                String s2 = val.pop();
                if(op.peek() == '+') val.push(s2 + s1 + "+");
                if(op.peek() == '-') val.push(s2 + s1 + "-");
                if(op.peek() == '/') val.push(s2 + s1 + "/");
                if(op.peek() == '*') val.push(s2 + s1 + "*");
                op.pop();
            }
            op.pop();
        }
        else{
            if(ch == '+' || ch =='-'){
                String s1 = val.pop();
                String s2 = val.pop();
                if(op.peek() == '+') val.push(s2 + s1 + "+");
                if(op.peek() == '-') val.push(s2 + s1 + "-");
                if(op.peek() == '/') val.push(s2 + s1 + "/");
                if(op.peek() == '*') val.push(s2 + s1 + "*");
                op.pop();
                op.push(ch);
            }
            else if(ch == '*' || ch == '/'){
                if(op.peek() =='*' || op.peek() == '/'){
                    String s1 = val.pop();
                    String s2 = val.pop();
                    if(op.peek() == '/') val.push(s2 + s1 + "/");
                    if(op.peek() == '*') val.push(s2 + s1 + "*");
                    op.pop();
                    op.push(ch);
                }
                else{
                    op.push(ch);
                }
            }
        }
    }
    while(val.size()>1){
        String s1 = val.pop();
        String s2 = val.pop();
        if(op.peek() == '+') val.push(s2 + s1 + "+");
        if(op.peek() == '-') val.push(s2 + s1 + "-");
        if(op.peek() == '/') val.push(s2 + s1 + "/");
        if(op.peek() == '*') val.push(s2 + s1 + "*");
        op.pop();
    }
    System.out.println(val.peek());
   }
}
