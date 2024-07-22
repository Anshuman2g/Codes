package Array2;

import java.util.*;
public class InputArr {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       //SO WHAT WE HAVE DONE IS HERE TO TAKE  N as INPUT
       //WE TAKE N AS A INPUT AND PUT IT IT ARRAY SIZE BRACKET
       System.out.println("enter the length of array");

       int n=sc.nextInt();
       int[]arr=new int[n];
       System.out.println("enter the elements of array");
       for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }

       
}
}
