package Medim;
import java.util.*;
public class leaderArr {
    static ArrayList<Integer>printLeadersBruteForce(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=arr[arr.length-1];
        ans.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {4,7,1,0};
           ArrayList<Integer> ans=printLeadersBruteForce(arr);
           for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
           }
    }
}
