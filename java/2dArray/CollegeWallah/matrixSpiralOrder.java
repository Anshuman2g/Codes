package CollegeWallah;
import java.util.Arrays;

public class matrixSpiralOrder {
    public static void main(String[] args) {
        int r=1;
        int c=4;
        int[][]ans={
            {1, 2, 3, 4}
        };
        int totalele=0;
        int tr=0,br=r-1,lc=0,rc=c-1;
        while(totalele<r*c){
         for(int i=lc;i<=rc && totalele<r*c;i++){
            System.out.print(ans[tr][i] +" ");
            totalele++;
         }
         tr++;
         for(int i=tr;i<=br && totalele<r*c;i++){
            System.out.print(ans[i][rc] + " ");
            totalele++;
         }
         rc--;
         for(int i=rc;i>=lc && totalele<r*c;i--){
            System.out.print(ans[br][i] + " ");
            totalele++;
         }
         br--;
         for(int i=br;i>=tr && totalele<r*c;i--){
            System.out.print(ans[i][lc] + " ");
            totalele++;
         }
         lc++;
        }
        System.out.println("total ele" +totalele);
    }
}

