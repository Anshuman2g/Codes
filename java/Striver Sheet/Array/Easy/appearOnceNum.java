package Easy;
import java.util.*;
public class appearOnceNum {
    static int uniqueNo(int[]arr){
        if(arr.length ==1){
            return arr[0];
        }
        int m=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
       
            for(int k=0;k<arr.length;k++){
                if(arr[i]!=-1){
               m=arr[i];
                }

            }
        }
       
        return m;
        
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
      int ans= uniqueNo(arr);
       System.out.println(ans);
    }
}
