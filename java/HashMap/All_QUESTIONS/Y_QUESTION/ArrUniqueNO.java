package Y_QUESTION;
import java.util.*;
public class ArrUniqueNO {
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4,4,5};
     
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(! mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int ans=0;
        for(var e : mp.keySet()){
            if(mp.get(e) % 2 !=0){
             ans=e;
            }
        }
        System.out.println(ans);
    }
}
