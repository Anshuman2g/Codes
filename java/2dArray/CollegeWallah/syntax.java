package CollegeWallah;
import java.util.*;
public class syntax{
    public static void main(String[] args) {
        // int[][]arr = new int[3][3];
        // int[][]arr= {
        //         {1,2,3},       //SIMPLE DECLARATION
        //         {4,5,6},
        //         {7,8,9}
        // };
//    ----------------------------------------------------------------------------------     
        // Scanner sc = new Scanner(System.in);
        // int[][]arr=new int[3][3];
        // for(int row =0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){    
        //         arr[row][col]=sc.nextInt();             //INPUT
        //     }
        // }
        // for(int row =0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //        System.out.print(arr[row][col]);             //OUTPUT
        //     }
        //     System.out.println("");
        // }
// ----------------------------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // int[][]arr=new int[3][3];             
        // arr[0]=new int[2];                   //DECLARING SIZE OF EACH COLUMN HERE
        // arr[1]=new int[3];
        // arr[2]=new int[4];
        // for(int row =0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         arr[row][col]=sc.nextInt();
        //     }
        // }
        // for(int row =0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //        System.out.print(arr[row][col]);
        //     }
        //     System.out.println("");
        // }
// -----------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        int[][]arr=new int[3][3];
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();             
            }
        }
        for(int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));    //ARRAYS.TOSTRING() method
        }
        for(var e : arr){
            System.out.println(Arrays.toString(e));             //INHANCED LOOP
        }
//----------------------------------------------------------------------------------------------
    }
}