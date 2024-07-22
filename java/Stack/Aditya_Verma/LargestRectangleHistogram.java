package Aditya_Verma;
import java.util.*;
public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int[]arr = {2,1,5,6,2,3};
        int[]ls=new int[arr.length];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ls[i]=-1;
            }
            else{
                ls[i]=st.peek();
            }
            st.push(i);
        }
        int[]rs= new int[arr.length];
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                rs[i]=arr.length;
            }
            else{
                rs[i]=s.peek();
            }
            s.push(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]*(rs[i]-ls[i]-1));
        }
        System.out.println(max);
    }
}
