package Subset;
import java.util.*;
public class iterativeSubset {
    // static ArrayList<ArrayList<Integer>> ss(int[]arr){
    //     ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
    //    outer.add(new ArrayList<>());
    //     for(var e : arr){ 
    //      int n=outer.size();
    //      for(int i=0;i<n;i++){
    //       ArrayList<Integer>inner = new ArrayList<>(outer.get(i));
    //       inner.add(e);
    //       outer.add(inner); 
    //      }
    //     }
    //     return outer;
    // }


    static ArrayList<ArrayList<Integer>> ssduplicate(int[]arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int st=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            st=0;
            if(i>0 && arr[i-1]==arr[i]){
                st=end+1;
            }
            end=outer.size()-1;
            // int n=outer.size();
            for(int j=st;j<=end;j++){
                ArrayList<Integer>inner = new ArrayList<>(outer.get(j));
                    inner.add(arr[i]);
                    outer.add(inner);
            }
        }
        return outer;
 }
    public static void main(String[] args) {
        int[]arr={1,2,2};
        List<ArrayList<Integer>> ans = ssduplicate(arr);
        System.out.println(ans);
    }
}
