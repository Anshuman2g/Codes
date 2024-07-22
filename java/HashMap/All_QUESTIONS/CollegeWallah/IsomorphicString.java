package CollegeWallah;
import java.util.*;
public class IsomorphicString {
    public static void main(String[] args) {
        String s1="aab";           //key
        String s2="xxy";           //value
        if(s1.length() != s2.length()){
            System.out.println("false");        //if length not equal then not isomorphic so false
        }  
        boolean flag = true;
        HashMap<Character,Character>mp = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(mp.containsKey(s1.charAt(i))){
                if(mp.get(s1.charAt(i)) != s2.charAt(i)){
                    flag=false;
                    break;
                }   
            }
            else{
                   if(mp.containsValue(s2.charAt(i))){
                    flag=false;
                    break;
                   }
                }
             mp.put(s1.charAt(i),s2.charAt(i));
        }
       System.out.println(flag);
    }
}
