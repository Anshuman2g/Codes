import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the string");
        String s = "HE issss";
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            boolean flag = true; // Capital letter
            char ch = s.charAt(i);
            int asci = (int) ch;
            if (asci >= 97)
                flag = false; // Small letter
            if (asci == 32){
                str.append(' ');
                continue;
            }
            if (flag == true) {
                asci += 32;
                char d = (char) asci;
                str.append(d);
            } else if (flag == false) {
                asci -= 32;
                char d = (char) asci;
                str.append(d);
            }
        }
        System.out.println(str.toString());
    }
}
