package Aditya_Verma;
import java.util.*;
public class GreaterToRIght {
    // public static void main(String[] args) {
    //     int[]arr={1,3,2,4};
    //     Stack<Integer>st = new Stack<>();
    //     ArrayList<Integer>ls = new ArrayList<>();
    //     for(int i =arr.length-1;i>=0;i--){
    //         st.push(arr[i]);
    //     }
    //     System.out.println(st);
    //     for(var e : arr){
    //         if(st.size() == 0){
    //             ls.add(-1);
    //         }
    //         else if (st.peek()>e){
    //             ls.add(st.peek());
    //         }
    //         else if(st.peek()<=e){
    //             while(st.size()>0 && st.peek()<=e){
    //                 st.pop();
    //             }
    //             if(st.size() == 0){
    //                 ls.add(-1);
    //             }
    //             else if(st.peek()>e){
    //                 ls.add(st.peek());
    //             }
    //         }
    //     }
    //     System.out.println(ls);
    // }
    // ----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        int[]arr={1,3,2,4};     
        ArrayList<Integer>ls = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
         for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            ls.add(st.isEmpty()?-1:st.peek());
            st.push(arr[i]);
         }
         Collections.reverse(ls);
         System.out.println(ls);
    }
}
