package Easy;
import java.util.*;
public class ZeroEndArr {
    static void solve(int[] arr){
        int i = 0;
        int j = 1;
        while(j < arr.length){
            if(arr[i] == 0 && arr[j] != 0){
                swap(arr,i,j);
                i++;j++;
            } else{
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void zeroEnd(int[]arr){
        // int j=-1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         j=i;
        //         break;
        //     }
        // }
        // for(int i=j+1;i<arr.length;i++){
        //     if(arr[i]!=0){
        //         swap(arr,i,j);
        //         j++;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        // zeroEnd(arr);
        solve(arr);
    }
    }

