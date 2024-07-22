package Xprac;
import java.util.*;
public class SmallerToRight {
    public static void main(String[] args) {
        int[]arr={8,10,2,5,4};
        Stack<Integer>st = new Stack<>();
        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && st.peek()>arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                ls.add(-1);
            }
            else{
                ls.add(st.peek());
            }
            st.push(arr[i]);
        }
        // Collections.reverse(ls);
        System.out.println(ls);
    }
}
