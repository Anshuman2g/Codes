package CollegeWallah;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[]arr={1,5,7,-1};
        int target=6;
       int[]ans={-1};
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int product= target-arr[i];
            if(! mp.containsKey(product)){
                mp.put(arr[i],i);
                
            }
            else{
              ans= new int[] {i,mp.get(product)};
              break;
            }
        }

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}
