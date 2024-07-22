package MergeSort;
import java.util.*;
public class recMergeSort {
    static int[]merge(int[]arr){
        if(arr.length == 1){
            return arr;
        }
        int med=arr.length/2;
        int[]left=merge(Arrays.copyOfRange(arr, 0, med));
        int[]right=merge(Arrays.copyOfRange(arr,med,arr.length));
        return(add(left,right));
    }
    static int[]add(int[]first,int[]second){
        int i=0;
        int j=0;
        int k=0;
        int[]mix=new int[first.length+second.length];
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    public static void main(String[] args) {
        int[]arr={4,35,1,8,2,9};
        int[]ans=(merge(arr));
        System.out.println(Arrays.toString(ans));
    }
}
