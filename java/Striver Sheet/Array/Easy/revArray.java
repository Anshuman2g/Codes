package Easy;
import java.util.*;
public class revArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int a=0;a<arr.length;a++){

            System.out.println(arr[a]);
        }
    }
}
