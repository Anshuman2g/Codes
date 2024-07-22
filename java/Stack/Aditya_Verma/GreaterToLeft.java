package Aditya_Verma;
import java.util.*;
public class GreaterToLeft {
    // public static void main(String[] args) {
    //     int[]arr={1,3,2,4};
    //    int[]res=new int[arr.length];
    //    res[0]=-1;
    //     for(int i=1;i<arr.length;i++){
    //         for(int j=i-1;j>=0;j--){
    //                 if(arr[j]>arr[i]){
    //                    res[i]=arr[j];
    //                     break;
    //                 }                          //BRUTE FORCE
    //                 else{
    //                    res[i]=-1;
    //                 }
    //         }
    //     }
    //    for(int m=0;m<res.length;m++){
    //     System.out.println(res[m]);
    //    }
    // }

    // public static void main(String[] args) {
    //     int[]arr={1,3,2,4};
    //     Stack<Integer>st = new Stack<>();
    //     ArrayList<Integer>ls = new ArrayList<>();
    //     for(int i=0;i<arr.length;i++){
    //         if(st.size() == 0){
    //             ls.add(-1);
    //         }
    //         else if(st.peek()>arr[i]){
    //             ls.add(st.peek());
    //         }
    //         else if(st.peek()<=arr[i]){
    //             while(st.size() > 0 && st.peek()<=arr[i]){
    //                 st.pop();
    //             }
    //             if(st.size() == 0){
    //                 ls.add(-1);
    //             }
    //             else{
    //                 ls.add(st.peek());
    //             }
    //         }
    //         st.push(arr[i]);
    //     }
    //     System.out.println(ls);
    // }


    public static void main(String[] args) {
            int[]arr={4,3,2,1};
            Stack<Integer>st = new Stack<>();
            ArrayList<Integer>ls = new ArrayList<>();
            for(var e : arr){
                while(! st.isEmpty() && st.peek()<=e){
                    st.pop();
                }
                // ls.add( ! st.isEmpty() && st.peek()>e ? st.peek():-1);
                ls.add(st.isEmpty()?-1:st.peek());
                st.push(e);
            }
            System.out.println(ls);
    }
}
