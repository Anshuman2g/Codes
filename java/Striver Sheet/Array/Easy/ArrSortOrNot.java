package Easy;
import java.util.*;
public class ArrSortOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int m=0;m<arr.length;m++){
            arr[m]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                 flag =false;
                 break;
                }
            }
        }
        System.out.println(flag);
    }
}
