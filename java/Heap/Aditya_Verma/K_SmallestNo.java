package Aditya_Verma;

import java.util.*;
public class K_SmallestNo{
 public static void main(String[] args) {
    int[]arr={7,10,4,3,20,15};
    int k=3;
    PriorityQueue<Integer>maxheap = new PriorityQueue<>((a,b)->b-a);
    for(int i=0;i<arr.length;i++){
      maxheap.add(arr[i]);
         if(maxheap.size()>k){
            maxheap.poll();
         }
      }
          System.out.println(maxheap.peek()); 
          System.out.println(maxheap);
    }
 }
