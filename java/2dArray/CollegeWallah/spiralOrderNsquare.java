package CollegeWallah;
import java.util.Arrays;

public class spiralOrderNsquare {
    public static void main(String[] args) {
        int n=5;
        int r=5;   int c=5;
        int tr=0;  int br=r-1;   int lc=0;   int rc=c-1;
        int te=0;  int ans=0;
        int[][]matrix=new int[n][n];
        while(te<r*c){
            for(int i=lc;i<=rc && te<r*c;i++){
                matrix[tr][i]=++ans;
                te++;
            }
            tr++;
            for(int i=tr;i<=br && te<r*c;i++){
                matrix[i][rc]=++ans;
                te++;
            }
            rc--;
            for(int i=rc;i>=lc && te<r*c;i--){
                matrix[br][i]=++ans;
                te++;
            }
            br--;
            for(int i=br;i>=tr && te<r*c;i--){
                matrix[i][lc]=++ans;
                te++;
            }
            lc++;
        }
        for(var e : matrix){
            System.out.println(Arrays.toString(e));
        }
     }
    }