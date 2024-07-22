package Easy;
import java.util.*;
public class RotateKmethod {
    static void Krotate(int[]arr,int k){
       
       int a=arr[0];
       int b=arr[arr.length-1];
       while(a<b){
       int temp=a;
      arr[a]=arr[b];
       arr[b]=temp;
       a++;
       b--;
       }
       int c=arr[0];
       int d=arr[k-1];
       while(c<d){
        int tem=c;
       arr[c]=arr[d];
        arr[d]=tem;
        c++;
        d--;
       }
        int e=k;
        int f=arr.length-1;
        while(e<f){
            int temps=e;
           arr[e]=arr[f];
            arr[f]=temps;
            e++;
            f--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
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
        System.out.println("enter k");
        int k=sc.nextInt();
       Krotate(arr,k);
      
    }
}
