package Easy;
import java.util.*;
public class OptDuplicateArr {
    static int noDuplicate(int[]arr){
        int i=0;
        int k=0;
        for(int m=1;m<arr.length;m++){
            if(arr[i]!=arr[m]){
                i++;
                arr[i]=arr[m];
                k=i;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            int m=noDuplicate(arr);
            
           System.out.println(m +" m is printed");
            for(int i=0;i<=m;i++){
                System.out.print(arr[i] + " ");
            }
    }
  }


