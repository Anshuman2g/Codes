package Arrays;

import java.util.ArrayList;

public class linSearchArrls {
    // static ArrayList<Integer> multipleans(int[]arr,int target,int i,ArrayList<Integer>ls){
    //     if(i == arr.length) return ls;
    //     if(arr[i] == target) ls.add(i);
    //      return multipleans(arr,target,i+1,ls);
    // }


    //list without passing argument
    static ArrayList<Integer> multipeleans(int[]arr,int target,int i){
        ArrayList<Integer>ls = new ArrayList<>();
        if(i == arr.length) return ls;
        if(arr[i]==target) ls.add(i);
               ArrayList<Integer>ans=multipeleans(arr, target, i+1);
               ls.addAll(ans);
               return ls;
    }
   public static void main(String[] args) {
    int[]arr={1,2,1,3};
    ArrayList<Integer>ls = new ArrayList<>();
//     System.out.println(multipleans(arr,6,0,ls));

      System.out.println(multipeleans(arr,1,0));
   }
}
