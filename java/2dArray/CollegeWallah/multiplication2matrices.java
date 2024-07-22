package CollegeWallah;
import java.util.Arrays;
import java.util.Scanner;

public class multiplication2matrices {
    static void multiply(int[][]arr,int r1,int c1,int[][]arr2,int r2,int c2){
        if(c1 != r2){
            System.out.println("error");
            return;
        }
          int[][]ans = new int[r1][c2];
          for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
               for(int k=0;k<c1;k++){
               ans[i][j]+=arr[i][k]*arr2[k][j];
               }
            }
          }
          for(var e : ans){
            System.out.println(Arrays.toString(e));
          }
    }
    public static void main(String[] args) {
      int[][]arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };
      int[][]arr2={
        {1,2},
        {3,4},
        {5,6}
      };
       multiply(arr, 3, 3, arr2, 3, 2);
    }
}
