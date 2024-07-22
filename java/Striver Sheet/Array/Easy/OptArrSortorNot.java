package Easy;
import java.util.*;
public class OptArrSortorNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]<arr[j-1]){
                flag =false;
                break;
            }
        }
        System.out.println(flag);
    }
}
