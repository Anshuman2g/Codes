package Aditya_Verma;

import java.util.PriorityQueue;

public class MinCostOfRopes {
    public static void main(String[] args) {
       int arr[] = {4, 3,2,6};
       int ttcn=0;
       PriorityQueue<Integer>minheap = new PriorityQueue<>();
       for(var e : arr){
        minheap.add(e);
       }
       while(minheap.size()>1){
        int first=minheap.poll();
        int second=minheap.poll();
       int  cn=first+second;
       ttcn+=cn;
        minheap.add(cn);
       }
       System.out.println(ttcn);
    }
}
