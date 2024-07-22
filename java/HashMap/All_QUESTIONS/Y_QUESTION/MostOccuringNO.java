package Y_QUESTION;
import java.util.*;
public class MostOccuringNO {
    public static void main(String[] args) {
        int[]arr={1,1,2,3,4,5,6,6,6,6,6};
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if( ! mp.containsKey(arr[i])){
                mp.put(arr[i],i);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(var e : mp.keySet()){
            if(mp.get(e)>max){
                max=e;
            }
        }
        System.out.println(max);
    }
}
