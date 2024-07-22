package Day1;
// https://leetcode.com/problems/number-of-arithmetic-triplets/description/
import java.util.*;
public class ArithemeticTriplet {

    public static void main(String[] args) {
        int[]nums = {0,1,4,6,7,10};
        int  diff = 3;
        HashMap<Integer,Integer>mp = new HashMap<>();
       
        int cn=0;
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i],1);
            int val=nums[i]-diff;
            int val2=nums[i]-2*diff;
            if( mp.containsKey(val) && mp.containsKey(val2)){
                cn++;
            }
        }
        System.out.println(cn);
    }
}
