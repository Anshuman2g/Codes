import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[]arr={5,4,3,1,2};
        int st=0;
        int end=arr.length-1;
        mergeinplace(arr,st,end);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeinplace(int[]arr,int st,int end){
        if(st == end){
            return ;
        }
        int med=st+(end-st)/2;
        mergeinplace(arr, st, med);         //calling function form st to med-1 
        mergeinplace(arr, med+1, end);          //calling function from med to arr.length-1
         mergesorted(arr,st,med,end);
    }
    static void mergesorted(int[]arr,int st,int mid,int end){
        int []mix= new int[end-st+1];
        int i=st;
        int j=mid+1;
        int k=0;
        while(i<=mid & j<=end){
            if(arr[i]<=arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
      while(i<=mid){
        mix[k++]=arr[i++];
      }
      while(j<=end){
       mix[k++]=arr[j++];
      }
      for(int l=0;l<mix.length;l++){
        arr[st+l]=mix[l];
      }
      return;
    }
}

