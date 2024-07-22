package Easy;
import java.util.*;
public class OptimalLargestEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int max=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
