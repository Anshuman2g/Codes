package Aditya_Verma;
import java.util.*;

class Pair{
    int a;
    int b;
    public Pair(int a, int b){
        this.a=a;
        this.b=b;
    }
}
public class K_ClosestNo {
               
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int x=3;
        int k=4;
        PriorityQueue<Pair>maxhp = new PriorityQueue<>((a,b)-> a.a == b.a ? b.b - a.b: b.a - a.a);
        for(int i=0;i<arr.length;i++){
            maxhp.add(new Pair(Math.abs(x-arr[i]),arr[i]));
            if(maxhp.size()>k){
                maxhp.poll();
            }
        }
        ArrayList<Integer>ls = new ArrayList<>();
        while(! maxhp.isEmpty()){
           ls.add(maxhp.peek().b);
           maxhp.poll();
        }
        Collections.sort(ls);
         System.out.println(ls);
    }
}

