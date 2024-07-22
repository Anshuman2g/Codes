package Array4;
import java.util.*;
public class SwappingTwoValue {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        

       int c=a; // yha c name ka ek alg variable bnaya a ki value c mai store kr di kionki woh gum na ho jaye . ab c mai value hai a k.
        a=b;
        b=c;//yha a=c mtlb a ko b ki value dedi

        System.out.println("the value of a after swapping"+a);
        System.out.println("the value of b after swapping"+b);

    }
}
