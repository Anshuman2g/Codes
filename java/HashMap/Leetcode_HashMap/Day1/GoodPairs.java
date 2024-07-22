package Day1;
// https://leetcode.com/problems/number-of-good-pairs/description/
import java.util.*;
public class GoodPairs{
    public static void main(String[] args) {
       int[]nums = {2,3,1,1,3,3};
      HashMap<Integer,Integer>mp = new HashMap<>();
      for(var e : nums){
        mp.put(e,mp.getOrDefault(e,0)+1);
      }
      int sum=0;
      for(int e : mp.keySet()){
        sum+=mp.get(e) * (mp.get(e)-1 )/2;
      }
      System.out.println(sum);
    }
}


















