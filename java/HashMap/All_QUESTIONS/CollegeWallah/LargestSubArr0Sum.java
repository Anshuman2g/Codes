package CollegeWallah;
import java.util.*;
public class LargestSubArr0Sum {
    static int sum(int[]arr){
        HashMap<Integer,Integer>mp= new HashMap<>();
        int max=0;
        int prefix=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(mp.containsKey(prefix)){
                max=Math.max(max,i-mp.get(prefix));
            }
            else{
                mp.put(prefix,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={15,-2,2,-8,1,7,10,23};
        System.out.println(sum(arr));
    }
}
