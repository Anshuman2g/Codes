package kunal_question;
import java.util.*;
public class FindTargetMountainArr {
    static int target(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int med=st+(end-st)/2;
          if(arr[med]>target){
                end=med-1;
            }
            else if(arr[med]<target){
                st=med+1;
            }
           else if(arr[med]==target){
                ans=med;
                end=med-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,3,1};
        int target =3;

        int ans=target(arr,target);
        System.out.println(ans);
    }
}
