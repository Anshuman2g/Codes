import java.util.Scanner;
public class swapSumDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();

        a=a+b;    // a=4    b=2        a= a+b=6
        b=a-b;    //  a=6      b=2      b=a-b = 4
        a=a-b;    //  a=6      b=4     a=a-b=2
        System.out.println("after add and sub method value of a is" +a);
        System.out.println("after add and sub method value of b is"+b);
    }
}
