package CollegeWallah.SeventhVid;

import java.util.ArrayList;

public class xReturnAll_indices {
    // static void no(int[]arr,int x ,int idx){
    //     if(idx == arr.length) return;     
    //     if(arr[idx] == x){
    //         System.out.println(idx);
    //     }
    //     no(arr,x,idx+1);
    // }

    // static ArrayList<Integer> no(int[]arr,int x,int idx,ArrayList<Integer>ls){        //Using ArrayList
    //         if(idx == arr.length) return ls;
    //         if(arr[idx] == x) ls.add(idx);
    //         return no(arr,x,idx+1,ls);
    // }

     static ArrayList<Integer> no(int[]arr,int x,int idx){        //Using ArrayList inside one
        ArrayList<Integer>ls = new ArrayList<>();
        if(idx == arr.length) return new ArrayList<>();
            if(arr[idx] == x) ls.add(idx);
            ArrayList<Integer>ans= no(arr,x,idx+1);
            ls.addAll(ans);
            return ls;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,2,2,5};
        int x=2;
        System.out.println(no(arr,x,0));
    }
}
