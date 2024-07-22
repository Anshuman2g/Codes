package Array3;
import java.util.*;
public class UniqueNum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
    
        int ans=0;
        System.out.println("enter the length of aray");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements in aray");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if( arr[j] == arr[k]){
                   arr[k]=-1;
                   arr[j]=-1;
                }
            }
        }
        for(int m=0;m<arr.length;m++){
            if(arr[m] != -1){
                ans =arr[m];
            }
        }
        System.out.println("the unique number in array is"+ans);
    }
}
