package HashSet;
import java.util.*;
public class MaxNoOnTable {
    public static void main(String[] args) {
        int[]arr={1,1};
        int cn=0;
        int max=Integer.MIN_VALUE;
        HashSet<Integer>st= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
                cn++;
            }
            else{
                cn--;
            }
            max=Math.max(max,cn);
        }
        System.out.println(max);
    }
}
