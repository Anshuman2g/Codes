package Y_QUESTION;
import java.util.*;
public class EvenNoOccurence {
    public static void main(String[] args) {
       String str =" aabbcdd"; 
       HashMap<Character,Integer>mp=new HashMap<>();
       for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(! mp.containsKey(ch)){
           mp.put(ch,1);
        }
        else{
            mp.put(ch,mp.get(ch)+1);
        }
       }
       String ans=" ";
       for(var e:mp.keySet()){
        if(mp.get(e)% 2 == 0){
            ans+=e;
        }
       }
       System.out.println(ans);
    }
}
