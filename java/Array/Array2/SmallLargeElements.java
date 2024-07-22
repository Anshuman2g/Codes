package Array2;
import java.util.*;
public class SmallLargeElements {
    public static void main(String[]args){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    int[]arr=new int[n];
    System.out.println("enter the elements of array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    for(int m=0;m<arr.length;m++){

        System.out.println(arr[m]);
    }
    
   System.out.println("the smallest element is"+arr[0]);
   System.out.println("largest element is"+arr[arr.length-1]);
}
}
