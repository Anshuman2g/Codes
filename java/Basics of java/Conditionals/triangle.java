import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a");
        int a=sc.nextInt();
        System.out.println("enter the b");
        int b=sc.nextInt();
        System.out.println("enter the c");
        int c=sc.nextInt();

        // Condition for three sides to be triangle
        // a+b>c
        // b+c>a
        // c+a>b
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("three sides are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}