package Array2;
import java.util.*;
public class occurence {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the value of x");
     int x=sc.nextInt(); ;
     int count=0;
     System.out.println("enter the lengt of array");
    int n=sc.nextInt();
    int[]arr=new int[n];
    System.out.println("enter the elements of array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        if(x == arr[i]){
            count++;
        }
    }
     System.out.println(count);
    }

    }
    

