package Medim;
import java.util.*;
public class twosum {
      
       static int[] twosum(int[]arr,int k){
          int[]ans=new int[2];
          for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
          }
          return ans;
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the k");
        int k=sc.nextInt();

     int[] result= twosum(arr,k);
    for(int i=0;i<result.length;i++){
        System.out.println(result[i]);
    }

    }
}
