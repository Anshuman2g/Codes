package Aditya_Verma;
import java.util.*;
public class SumOfKelements {
    static int largest(int[]arr , int k){
          PriorityQueue<Integer>maxheap = new PriorityQueue<>((a,b)->b-a);  
          for(var e : arr){
            maxheap.add(e);
            if(maxheap.size()>k){
                maxheap.poll();
            }
          }
          return maxheap.peek();
    }
    public static void main(String[] args) {
        int[]arr={10, 2, 50, 12, 48, 13};
        int k1=2;
        int k2=6;
        int ans= largest(arr,k1);
        int ans2=largest(arr,k2);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans && arr[i]<ans2){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
