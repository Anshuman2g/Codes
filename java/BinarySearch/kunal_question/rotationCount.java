package kunal_question;
import java.util.*;
public class rotationCount {
    static int count(int[]arr){
       int st=0;
       int end=arr.length-1;
       int min=Integer.MAX_VALUE;
       int rot=0;
       if(arr[st]<=arr[end]){
        rot=st;
        min=arr[st];
       }
       while(st<=end){
        int med=st + (end-st)/2;
        if(arr[st]<=arr[med]){
            if(arr[st]<min){
                rot=st;
                min=arr[st];
            }
            st=med+1;
        }
        else if(arr[med]<arr[end]){
          if(arr[med]<min){
            rot=med;
            min=arr[med];
          }
          end=med-1;
        }
       }
       return rot;
    }
    public static void main(String[] args) {
        // int[]arr={2,3,6,12,15,18};
        // array after rotation
        int[]arr={15,18,2,3,6,12};
        System.out.println(count(arr));
    }
}
