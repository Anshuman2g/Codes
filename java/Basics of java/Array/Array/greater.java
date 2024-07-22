package Array;
import java.util.Scanner;
public class greater {
    public static void main(String[] args) {

       int[] num={1,2,3,4,4};
       int x=2;
       int count=0;
       for(int i=0;i<num.length;i++){
        if (num[i] > x){
            count ++;
        }
       }
       System.out.println(count);

    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the length");
    //     int n=sc.nextInt();
    //     int[] arr=new int[n];

    //     System.out.println("enter the elements of array");
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }

    //     System.out.println("enter the number");
    //     int x=sc.nextInt();

    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //     if(arr[i] >x){
    //         count++;
    //        }      
    //     }
    //     System.out.println(count);
    }
    
}
