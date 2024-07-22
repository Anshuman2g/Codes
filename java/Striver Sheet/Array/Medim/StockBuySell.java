package Medim;
import java.util.*;
public class StockBuySell {
    static int profit(int[]arr){
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]-min>profit){
                profit=arr[i]-min;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans=profit(arr);
        System.out.println(ans);
    }
}
