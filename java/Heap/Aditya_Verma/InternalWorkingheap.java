package Aditya_Verma;
import java.util.*;
public class InternalWorkingheap {
    public static void main(String[] args) {
        int[]arr={3,2,1,4,5,6};
        PriorityQueue minheap = new PriorityQueue();
        for(int i=0;i<arr.length;i++){
            minheap.add(arr[i]);
        }    
            System.out.println(minheap);
            
        while(! minheap.isEmpty()){
            System.out.println(minheap.poll());
            System.out.println(minheap);
        }
    }
}
