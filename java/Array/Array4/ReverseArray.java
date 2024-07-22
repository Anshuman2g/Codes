package Array4;
import java.util.*;
public class ReverseArray {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
       System.out.println("enter the elements");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
                int s=0;
                int e=arr.length-1;
                while(s<e){
                    int a=arr[s];    //here we have store the value of s[0] in a
                 arr[s]=arr[e];
                 arr[e]=a;
                 s++;
                 e--;

                }
                 for(int m=0;m<arr.length;m++){
                    System.out.print(""+arr[m]);
                 }
    }
}
