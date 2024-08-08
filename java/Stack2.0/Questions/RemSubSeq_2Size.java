package Questions;

import java.util.*;

public class RemSubSeq_2Size {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2, 2 }; // 1 3 5 2
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (st.isEmpty())
                st.push(arr[i]);
            else {
                if (st.peek() == arr[i]) {
                    while (i<arr.length && arr[i] == st.peek()) {
                        i++;
                    }
                    st.pop();
                    i--;
                } else { 
                    st.push(arr[i]);
                }
            }
            i++;
        }
        System.out.println(st);
    }
}
