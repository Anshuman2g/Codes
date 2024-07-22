package CollegeWallah;
import java.util.*;
public class Most_frequent_Arr{
    static int mostfreq(int[]ar){
       HashMap<Integer,Integer> mp =new HashMap<>();
       for(int i=0;i<ar.length;i++){
        if(! mp.containsKey(ar[i])){
            mp.put(ar[i],1);
        }
        else{
            mp.put(ar[i],mp.get(ar[i])+1);
        }
       }

       int max=0;
       for( var e : mp.keySet()){
        if(mp.get(e)>max){
            max=e;
        }
       }
       return max;
    }
    public static void main(String[] args) {
        int[]arr={1,3,2,1,4,1};

        int mp= mostfreq(arr);
         System.out.println(mp);
    }
}