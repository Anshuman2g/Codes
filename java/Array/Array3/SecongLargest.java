package Array3;
import java.util.*;
public class SecongLargest {
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        int max= Integer.MIN_VALUE;

        System.out.println("enter the length of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int h=0;
        for( int m=0;m<arr.length;m++){
                    if (arr[m] > max){
                        h=m;
                        max=arr[h];
                        //arr[m]=Integer.MIN_VALUE;

                    }
                }
                arr[h]=Integer.MIN_VALUE;
                max=Integer.MIN_VALUE;
                for( int z=0;z<arr.length;z++){
                    if(arr[z]>max){
                        max=arr[z];
                    }
                }
               // System.out.println(max);
                for(int a=0;a<arr.length;a++){
                    System.out.print(arr[a]+" ");
                }
                System.out.println("the second largest element is"+max);
    }
}
