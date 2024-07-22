package Array4;
import java.util.*;
public class SwapSumDIff {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();   //12
        int b=sc.nextInt();    //3
        a=a+b;                         // a=15
        b=a-b;                         // b=12
        a=a-b;                         // a=3
        System.out.println("values after swapping"+a);
        System.out.println("values aftere swapping"+b);
    }
}
