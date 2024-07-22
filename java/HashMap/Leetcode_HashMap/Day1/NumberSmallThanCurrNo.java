package Day1;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
import java.util.*;
public class NumberSmallThanCurrNo {
    // public static void main(String[] args) {
    //    int[] nums = {8,1,2,2,3};
    //    ArrayList<Integer>ans = new ArrayList<>();
    //    for(int i=0;i<nums.length;i++){
    //     int cn=0;
    //     for(int j=0;j<nums.length;j++){
    //         if(nums[i]>nums[j]){
    //             cn++;                            //BRUTE FORCE METHOD------------
    //         }
    //     }
    //        ans.add(cn);
    //    }
    //    int[]an=new int[ans.size()];
    //    for(int i=0;i<ans.size();i++){
    //     an[i]=ans.get(i);
    //    }

    //    for(int i=0;i<an.length;i++){
    //     System.out.println(an[i]);
    //    }
    // }
                                                                                                           
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[]ans= new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i];
        }
        Arrays.sort(ans);
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<ans.length;i++){
            if (! mp.containsKey(ans[i])){
                mp.put(ans[i],i);
            }
        }
        for(int i=0;i<ans.length;i++){
           ans[i]=mp.get(nums[i]);
        }

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
