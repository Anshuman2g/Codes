package Array2;
import java.util.*;
public class ArraySort {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    boolean check = true;
    System.out.println("enter the length of array");
    int n =sc.nextInt();
    int[]arr=new int[n];
    System.out.println("enter the elements of array");
    for(int i=1;i<arr.length;i++){
        arr[i]=sc.nextInt();
      if(arr[i] <arr[i-1]){
        check =false;
        break;
      }
    }
    System.out.println(check);
  }
}
