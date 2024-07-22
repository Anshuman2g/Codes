package Xprac;
import java.util.*;
public class SmallerTOLEft {
    public static void main(String[] args) {
        int[]arr={5,6,3,4};
        int[]res=new int[arr.length];
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
