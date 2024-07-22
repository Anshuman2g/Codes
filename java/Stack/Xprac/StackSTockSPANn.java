package Xprac;
import java.util.*;
public class StackSTockSPANn {
    public static void main(String[] args) {
        int[]arr={10, 4, 5, 90, 120, 80};
        Stack<Integer>st = new Stack<>();
        int[]res=new int[arr.length];
        st.push(0);
        res[0]=1;
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            res[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
