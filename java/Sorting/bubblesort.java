package Sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[]arr={5,2,3,4,1};
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }
        if(!flag) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
