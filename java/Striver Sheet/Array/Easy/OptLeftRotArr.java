package Easy;
import java.util.*;
public class OptLeftRotArr {
    static void leftRot(int[]arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
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
        leftRot(arr);
}
    }

