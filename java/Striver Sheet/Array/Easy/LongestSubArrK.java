package Easy;
import java.util.*;
public class LongestSubArrK {
    
    static int longestsubarr(int[]arr,int k){
       int len=0;
       for(int i=0;i<arr.length;i++){
        int s=0;
        for(int j=i;j<arr.length;j++){
           s+=arr[j];
           if(s==k){
               len=Math.max(len,j-i+1);
        }
        }
       }
       return len;
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

        int ans=longestsubarr(arr,k);
        System.out.println(ans+"is the longest subarray");
    }
}
