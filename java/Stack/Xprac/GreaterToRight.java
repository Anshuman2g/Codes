package Xprac;
import java.util.*;
public class GreaterToRight {
    public static void main(String[] args) {
        int arr[]={1,3,2,4};
        Stack<Integer>st = new Stack<>();
        ArrayList<Integer>ls = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                ls.add(-1);
            }
            else if(arr[i]<st.peek()){
                ls.add(st.peek());
            }
            st.push(arr[i]);
        }
            //   Collections.reverse(ls);
        System.out.println(ls);
    }
}
