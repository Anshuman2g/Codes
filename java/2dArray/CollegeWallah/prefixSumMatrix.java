package CollegeWallah;
import java.util.Arrays;

public class prefixSumMatrix {
    // static int bruteforcesum(int[][]matrix,int l1,int l2,int r1,int r2){
    //     int sum=0;
    //     for(int i=l1;i<=l2;i++){
    //         for(int j=r1;j<=r2;j++){
    //             sum+=matrix[i][j];
    //         }
    //     }
    //     return sum;
    // }
//---------------------------------------------------------------------------------
    // static int[][] prefix (int [][] matrix){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=1;j<matrix[0].length;j++){
    //             matrix[i][j]=matrix[i][j]+matrix[i][j-1];
    //         }
    //     }
    //     for(var e : matrix){
    //         System.out.println(Arrays.toString(e));
    //     }
    //     return matrix;
    // }
    // static int prefixsum(int[][]matrix,int l1,int l2,int r1,int r2){
    //         prefix(matrix);
    //         int sum=0;
    //         for(int i=l1;i<=l2;i++){
    //             if(r1>=1)
    //           sum+=matrix[i][r2] - matrix[i][r1-1];
    //           else
    //           sum+=matrix[i][r2];
    //         }
    //         return sum;
    // }
//  -----------------------------------------------------------------------------------------------------------   
static int[][] prefix (int [][] matrix){
    for(int i=0;i<matrix.length;i++){
        for(int j=1;j<matrix[0].length;j++){
            matrix[i][j]=matrix[i][j]+matrix[i][j-1];
        }
    }
    for(int i=1;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=matrix[i][j]+matrix[i-1][j];
        }
    }
    for(var e : matrix){
        System.out.println(Arrays.toString(e));
    }
    return matrix;
}

static int prefixsumColRow(int[][]matrix,int l1,int l2,int r1,int r2){
        prefix(matrix);
          return matrix[l2][r2]-matrix[l1-1][r2]-matrix[l2][r1-1]+matrix[l1-1][r1-1];
}
    public static void main(String[] args) {
        int[][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int l1=1, l2=2;
        int r1=1, r2=2;

        // System.out.println(bruteforcesum(arr,l1,l2,r1,r2));

        // System.out.println(prefixsum(arr, l1, l2, r1, r2));

        System.out.println(prefixsumColRow(arr, l1, l2, r1, r2));
    }
}
