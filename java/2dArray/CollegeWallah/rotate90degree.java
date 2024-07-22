package CollegeWallah;
import java.util.Arrays;

public class rotate90degree {
    static void rev(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //transpose the matrix first 
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                 int temp=arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=temp;
            }
        }
       //reverset the matrix 
        // for(int i=0;i<arr.length;i++){
        //    rev(arr[i]);      //in this function we are passing a single row at a time to the function
        // }
        
        for(var e : arr){
            System.out.println(Arrays.toString(e));
        }
    }
}
