package Array3;
import java.util.*;
public class PairSumX {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter the value of x");
    int x=sc.nextInt();
    System.out.println("enter the length of array");
    int n=sc.nextInt();
    int[]arr=new int [n];
    System.out.println("enter the elements of array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int j=0;j<arr.length;j++){
        for(int k=j+1;k<arr.length;k++){
            if(x == arr[j]+arr[k]){
                count++;
            }
        }
    }
     
    System.out.println(count);
    }
}
