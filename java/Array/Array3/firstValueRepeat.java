package Array3;
import java.util.*;
public class firstValueRepeat {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int ans=0;
    System.out.println("enter the length");
    int n=sc.nextInt();
    int[]arr=new int[n];
    System.out.println("enter the elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int m=0;m<arr.length;m++){
        for( int x=m+1;x<arr.length;x++){
            if (arr[m] == arr[x]){
                ans = arr[m];
                break;

            }
        }
        if (ans!= -1){
        break;
    }
}
    System.out.println("The first repeating number is"+ans);
   } 
}
