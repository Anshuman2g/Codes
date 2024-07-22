package Day1;
// https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
import java.util.*;
public class countConsistentString {
    public static void main(String[] args) {

        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        HashSet<Character>st = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            if(! st.contains(allowed.charAt(i))){
                st.add(allowed.charAt(i));
            }
        }

        int cn=0;
        for(int i=0;i<words.length;i++){
           String s = words[i];
           int x=0;
            for(int j=0;j<s.length();j++){
             if( st.contains(s.charAt(j))){
                x++;
             }
            }
            if(x == s.length()){
                cn++;
            }
        }
        System.out.println(cn);
    }
}
