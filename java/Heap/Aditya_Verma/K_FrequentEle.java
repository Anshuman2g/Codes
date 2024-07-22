package Aditya_Verma;
import java.util.*;
class Pair{
    int a;
    int b;
    public Pair(int a , int b){
        this.a=a;
        this.b=b;
    }
}
public class K_FrequentEle {
    public static void main(String[] args) {
       int[]arr= {1,1,1,2,2,3};
       int k = 2;
     HashMap<Integer,Integer>mp = new HashMap<>();
     for(var e : arr){
        mp.put(e,mp.getOrDefault(e,0)+1);
     }
     PriorityQueue<Pair>minheap = new PriorityQueue<>((a,b) -> a.a - b.a);
     for(var e : mp.keySet()){
        minheap.add(new Pair(mp.get(e),e));
        if(minheap.size()>k){
            minheap.poll();
        }
     }
     ArrayList<Integer>ls = new ArrayList<>();
     while(! minheap.isEmpty()){
         ls.add(minheap.peek().b);
         minheap.poll();
        }
        int[]ans= new int[ls.size()];
        int idx=0;
       for(var e : ls){
        ans[idx++]=e;
       }
       for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
       }
    }
}
