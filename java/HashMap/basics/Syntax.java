package BASICs;
import java.util.*;

public class Syntax{
    public static void main(String[] args) { 
        //Syntax for hashmap
        HashMap<String,Integer> mp= new HashMap();

        //To add something
        mp.put("Ram",21);
        mp.put("xa",21);

    //     //to fetch that value
    //     System.out.println(mp.get("Ram"));

    //     //to change the value of key
    //     mp.put("Ram",99);
    //     System.out.println(mp.get("Ram"));

    //     //to delete the key
    //     System.out.println(mp.remove("Ram"));
    //     System.out.println(mp.remove("raa"));

    //     //checking if it contains key
    //     System.out.println(mp.containsKey("xa"));

    //     //adding a new entry if that new entry doesnt exist
    //     if(!mp.containsKey("po")){
    //      mp.put("po",21);
    //     } 
    //         //OR
    // System.out.println(mp.putIfAbsent("pop",9999));  

    //     //getting all keys
    //     System.out.println(mp.keySet());
    //     //getting all values
    //     System.out.println(mp.values()); 
    //     //getting all values and keys
    //     System.out.println(mp.entrySet());
          
        //traverse through all hashmap and print its value
        for(Map.Entry<String,Integer> e : mp.entrySet() ){
            System.out.printf("the age of %s is %d%n",e.getKey(),e.getValue());
        }
    }
}