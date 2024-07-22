
import java.util.*;
public class sort {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int[]arr =new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();       
         }
               Arrays.sort(arr);
            // System.out.println(arr[n]);
            System.out.println(arr[0] + "this is smallest no"  +arr[n-1] +"this is largest no ");


    }

    
}
