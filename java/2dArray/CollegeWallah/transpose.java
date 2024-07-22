package CollegeWallah;
import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //INPLACE TRANSPOSE
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(var e : arr){
            System.out.println(Arrays.toString(e));
        }
        
        //   -------------------------------------------------------------------------------------------      
        // int[][]ans= new int[3][3];
        // for(int i=0;i<arr.length;i++){
            //     for(int j=0;j<arr[i].length;j++){
                
            //         int m=j;
            //          int n=i;
            //         ans[i][j]=arr[m][n];       
            //         // OR
            //         // ans[i][j]=arr[j][i];
            //     }
        // }
        // for(var e : ans){
        //     System.out.println(Arrays.toString(e));
        // }
        // ------------------------------------------------------------------------------------
    }
}
