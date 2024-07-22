package Aditya_Verma;

import java.util.*;

public class nearlySorted {
    public static void main(String[] args) {
        int arr[] = {6,5,3,2,8,10,9};
        int k=3;
        ArrayList<Integer>ls = new ArrayList<>();
        PriorityQueue<Integer>minheap  = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minheap.add(arr[i]);
            if(minheap.size() > k){
                ls.add(minheap.poll());
            }
        }
        while(!minheap.isEmpty()){
            ls.add(minheap.poll());
        }
        System.out.println(ls);
    }
}
