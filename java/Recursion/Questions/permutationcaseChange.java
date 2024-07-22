import java.util.*;

public class permutationcaseChange {
    public static void main(String[] args) {
        String str = "ab";
        ArrayList<String> ls = new ArrayList<>();
        casee(" ", str, ls);
        System.out.println(ls);
    }

    static void casee(String p, String u, ArrayList<String> ls) {
        if (u.isEmpty()) {
            ls.add(p);
            return;
        }
        char ch = u.charAt(0);
        casee(p + Character.toLowerCase(ch), u.substring(1), ls);
        casee(p + Character.toUpperCase(ch), u.substring(1), ls);
    }
}
