package BASICs;
import java.util.*;
public class Syntax2{
    public static void main(String[] args) {
        HashMap<String,Integer>mp=new HashMap<>();
         mp.put("AAA",111);
         mp.put("BBB",222);
         mp.put("CCC",333);
        //  System.out.println(mp.containsKey("AAA"));
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
        // System.out.println(mp.entrySet());

        for(Map.Entry<String,Integer> e : mp.entrySet()){
       System.out.printf("the value of %s is %d %n",e.getKey(),e.getValue());
        }
    }
}