package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class greatertoright {
    public static void main(String[] args) {
        int[]arr={1,3,2,1,8,6,3,4};
        ArrayList<Integer>ls = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <=arr[i]){
                st.pop();
            }
            ls.add(st.isEmpty()?-1:st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(ls);
        System.out.println(ls);
    }
}

