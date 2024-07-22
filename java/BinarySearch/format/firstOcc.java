package format;
import java.util.*;
public class firstOcc {
    static int first(int[]arr,int x){
        int st=0;
        int end=arr.length-1;

        int fo=-1;
        while(st<=end){
            int med= st + (end-st)/2;
           
            if(x == arr[med]){ 
                fo=med;
                end=med-1;
            }
            else if(x<arr[med]){
                end=med-1;
            }
            else{
                st=med+1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int[]arr={5,5,5,5,6,6,8,9,9,9};
        int x=5;

        System.out.println(first(arr,x));
    }
}
