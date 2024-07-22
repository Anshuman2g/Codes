package Array2;
import java.util.*;
public class lastOccurence {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ans=-1;
        System.out.println("enter the x");
        int x=sc.nextInt();
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i] == x){
             ans =i;
            }
        }
         System.out.println("the x that occured at last is at this index"+ans);
    }
    
}
