package Xprac;
import java.util.*;
public class StackStockSpan {
    public static void main(String[] args) {
        int arr[]={100 ,80 ,60 ,70 ,60 ,75 ,85};
        ArrayList<Integer>ls = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
    //    st.push(0);
       for(int i=0;i<arr.length;i++){
        while(st.size()>0 && arr[st.peek()]<=arr[i]){
            st.pop();
        }
        if(st.size() == 0){
            ls.add(i+1);
        }
        else{
            ls.add(i-st.peek());
        }
        st.push(i);
       }
       System.out.println(ls);
    }
}
