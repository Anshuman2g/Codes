package Xprac;
import java.util.*;
public class LargestRectHis {
    public static void main(String[] args) {
        int[]arr={2,4};
        int[]lft=new int[arr.length];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
         if(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
         }
         lft[i]=st.isEmpty()?-1:st.peek();
         st.push(i);
        }
        int[]rt=new int[arr.length];
        Stack<Integer>st2 = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
         if(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
            st2.pop();
         }
         rt[i]=st2.isEmpty()?arr.length:st2.peek();
         st2.push(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]*(rt[i]-lft[i]-1));
        }
        System.out.println(max);
    }
}
