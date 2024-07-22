package HashSet;
import java.util.*;
public class LongestConsecutiveEle {
    public static void main(String[] args) {
        int[]arr={100,4,200,1,2,3};
        int max=Integer.MIN_VALUE;
        HashSet<Integer>st=new HashSet<>();


        for(int i=0;i<arr.length;i++){       //adding elements to hashset
            st.add(arr[i]);
        }  

        
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i]-1)){
                int curVal=arr[i];
                int cn=1;
            while(st.contains(curVal+1)){
                cn++;
                curVal++;
            }
            max=Math.max(max,cn);
          }
        }
        System.out.println(max);
    }
}
