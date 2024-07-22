package Aditya_Verma;
import java.util.*;
public class K_LargestNo {
    public static void main(String[] args) {
        int[]arr={7,10,4,3,20,15};
        int k=3;
        PriorityQueue<Integer>minheap= new PriorityQueue();
        for(int i=0;i<arr.length;i++){
            minheap.add(arr[i]);
            if(minheap.size() > k){
                minheap.poll();
            }
        }
       while(minheap.size()>0){
       System.out.println(minheap.poll());
       }
    }
}
