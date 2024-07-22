package Day1;
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
import java.util.*;
public class Panagram {
    // public static void main(String[] args) {
    //     String sentence = "thequickbrownfoxjumpsoverthelazydog";
    //     int[]arr=new int[26];
    //     for(int i=0;i<sentence.length();i++){
    //         arr[sentence.charAt(i)-'a']++;
    //     }
    //     boolean flag=false;
    //     for(int i=0;i<26;i++){
    //       if(arr[i]<1){
    //         flag=false;
    //         break;
    //       }
    //       else{
    //         flag=true;
    //       }
    //     }
    //     System.out.println(flag);
    // }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character,Integer>mp= new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            if (! mp.containsKey(sentence.charAt(i))){
                mp.put(sentence.charAt(i),1);  //if 26 keys exist then it means there all character
            }
            else{
                mp.put(sentence.charAt(i),mp.get(sentence.charAt(i))+1);
            }
        }
        boolean flag=false;
        if ( mp.size() == 26){
            flag=true;
        }
        else{
            flag=false;
        }
        System.out.println(flag);
    }
}
