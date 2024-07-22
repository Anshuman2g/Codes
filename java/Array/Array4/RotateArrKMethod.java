package Array4;
import java.util.*;
public class RotateArrKMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
          int s=0;
          int e=arr.length-1;
        while(s<e ){
            int a=arr[s];
                 arr[s]=arr[e];
                 arr[e]=a;
              s++;
              e--;
        }
       int k=sc.nextInt();
       int x=0;
       int y=k-1;
       while(x<y){
        int z=arr[x];
        arr[x]=arr[y];
        arr[y]=z;
        x++;
        y--;
       }

       int g=k;
       int f=arr.length-1;
       while(g<f){
        int j=arr[g];
        arr[g]=arr[f];
        arr[f]=j;
        g++;
        f--;
       }


       for(int p=0;p<arr.length;p++){
        System.out.print(arr[p]);
       }

        
        
     
    }
}
