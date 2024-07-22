import java.util.ArrayList;
import java.util.Arrays;

public class maxEleEachRow {
    static int max(int[]arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[][]arr={
              {1,2,3},
              {1,4,9},
              {76,34,21}
        };
        int r=arr.length;
        int[][]ans2 = new int[r][1];
        int cnn=0;
        for(int i=0;i<arr.length;i++){
            ans2[cnn++][0]=max(arr[i]);
        }
        for(var e : ans2){
            System.out.println(Arrays.toString(e));
        }
        // ArrayList<Integer>ls = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     ls.add(max(arr[i]));
        // }
        // for(var e : ls){
        //     System.out.println(e);
        // }
        // int[][]ans = new int[r][1];
        // int cn=0;
        // for(int i=0;i<ans.length;i++){
        //     for(int j=0;j<ans[i].length;j++){
        //         ans[i][j]=ls.get(cn++);
        //     }
        // }
        // for(var e : ans){
        //     System.out.println(Arrays.toString(e));
        // }
    }
}
