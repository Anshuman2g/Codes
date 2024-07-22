package Binary1DArr;
import java.util.*;
public class upperbound {
    static int upper(int[]arr,int x){
        int st=0;
        int end=arr.length-1;
        int ans=0;
        while(st<=end){
            int med=st + (end-st)/2;
            if(arr[med]>x){
                 ans=med;
                 end=med-1;
            }
            else if(arr[med]<=x){
                st=med+1;
            }
        }
        return ans;
    }
   public static void main(String[] args) {
    int[] arr={1,3,5,8,11};
    int x=8;
              System.out.println(upper(arr,x));
   } 
}
