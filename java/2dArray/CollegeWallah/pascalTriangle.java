package CollegeWallah;
import java.util.Arrays;

public class pascalTriangle {
    public static void main(String[] args) {
        int n=4;
        int[][]ans = new int[n][];
        for(int i=0;i<n;i++){
            ans[i]=new int[i+1];
         ans[i][0]=1;
         ans[i][i]=1;
         for(int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
         }
        }
        for(var e : ans){
            System.out.println(Arrays.toString(e));
        }
    }
}
