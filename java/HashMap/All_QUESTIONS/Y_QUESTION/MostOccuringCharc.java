package Y_QUESTION;
import java.util.*;
public class MostOccuringCharc {
    public static void main(String[] args) {
        String str="HHHHHHHHHHLLLLoo";
    
    HashMap<Character,Integer>mp=new HashMap<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(! mp.containsKey(ch)){
            mp.put(ch,1);
        }
        else{
            mp.put(ch,mp.get(ch)+1);
        }
    }
    int max=Integer.MIN_VALUE;
    char ans=' ';
    for(var e : mp.keySet()){
       if(mp.get(e)>max){
        max=mp.get(e);
       ans=e;
       }
    }
    System.out.println(ans);
}
}
