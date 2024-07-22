package Y_QUESTION;
import java.util.*;
public class StringUniqueCh {
    public static void main(String[] args) {
       String s ="hheelloop";
       HashMap<Character,Integer>mp=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        if(! mp.containsKey(ch)){
            mp.put(ch,1);
        }
        else{
            mp.put(ch,mp.get(ch)+1);
        }
       } 
       char ans=' ';
       for(var e : mp.keySet()){
        if(mp.get(e) % 2 !=0){
         ans=e;
        }
       }
       System.out.println(ans);
    }
}
