package Xprac;
import java.util.*;
public class GreaterToRightt {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        Stack<Integer>st = new Stack<>();
        int[]res=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        for(int m=0;m<res.length;m++){
            System.out.print(res[m]);
        }
    }
}
