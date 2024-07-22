package Y_QUESTION;

import java.util.HashMap;

public class Anagram {
    static HashMap<Character,Integer>freq(String str){
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(! mp.containsKey(ch)){
            mp.put(ch,1);
            }
            else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        String s="listen";
        String s2="silent";

        HashMap<Character,Integer>mp=freq(s);
        HashMap<Character,Integer>np=freq(s2);

        if(mp.equals(np)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
