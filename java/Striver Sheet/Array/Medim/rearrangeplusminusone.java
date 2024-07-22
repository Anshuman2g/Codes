package Medim;
import java.util.*;
public class rearrangeplusminusone {
    static int[]rearrange(int[]arr){
        int []ans=new int[arr.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[]kaa=rearrange(arr);
        for(int i=0;i<kaa.length;i++){
            System.out.println(kaa[i]);
        }
    }
}
