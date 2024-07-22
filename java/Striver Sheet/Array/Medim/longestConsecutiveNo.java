package Medim;
import java.util.*;
public class longestConsecutiveNo {
    static int longestcons(int[]arr){
        Arrays.sort(arr);
        int longest=1;
        int smaller=arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]-1==smaller){
           count++;
           smaller=arr[i];
          }
          else{
            count=1;
            smaller=arr[i];
          }
          longest=Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=longestcons(arr);
        System.out.println(ans);
    }
}
