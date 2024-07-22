package Xprac;
import java.util.*;
public class StockSpan {
    public static void main(String[] args) {
        int arr[]={100 ,80 ,60 ,70 ,60 ,75 ,85};
        ArrayList<Integer>ls = new ArrayList<>();
        ls.add(0,1);
        for(int i=1;i<arr.length;i++){
            int cn=1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    cn++;
                }
                else{
                    break;
                }
            }
            ls.add(cn);
        }
        System.out.println(ls);
    }
}
