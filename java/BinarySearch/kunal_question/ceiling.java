package kunal_question;
import java.util.*;
public class ceiling {
    static int greaterequal(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        //edge case below
        if(target>arr[arr.length-1]){
            return -1;
        }
        //greater equal than target but smallest in arr
        while(st<=end){
            int med=st + (end-st)/2;
            if(arr[med]>=target){
                ans=med;
                end=med-1;
            }
            else{
                st=med+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,5,8,11,15,19};
        int target = 16;
        int ans= greaterequal(arr,target);
        System.out.println(ans);
    }
}
