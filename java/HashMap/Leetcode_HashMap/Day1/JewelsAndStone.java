package Day1;
// https://leetcode.com/problems/jewels-and-stones/description/

import java.util.HashSet;

public class JewelsAndStone {
    public static void main(String[] args) {
       String jewels = "aA";
       String  stones = "aAAbbbb";
       HashSet<Character>st=new HashSet<>();
       for(int i=0;i<jewels.length();i++){
        st.add(jewels.charAt(i));
       }

       int cn=0;
       for(int i=0;i<stones.length();i++){
        if(st.contains(stones.charAt(i))){
            cn++;
        }
       }
       System.out.println(cn);
    }
}
