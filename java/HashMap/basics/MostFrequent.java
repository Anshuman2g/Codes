package basics;
import java.util.*;
public class MostFrequent {
    public static void main(String[] args) {
        int[]arr={1,3,2,1,4,1};
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(var e : arr){
          if(!mp.containsKey(arr)){
            mp.put(e,1);
          }
          else{
            mp.put(e,mp.get(e)+1);
          }
        }
        int freq=0;
        for(var m : mp.keySet()){
         if (mp.get(m)>freq) {
          freq=mp.get(m);
         }
        }
        System.out.printf("%d",freq);
    }
}
