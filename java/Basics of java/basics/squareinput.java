import java.util.Scanner;

public class squareinput{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the value :");
    int a=sc.nextInt();
  
    int b =a*a;
    System.out.println("the square of given no is : ");
    System.out.println(b);
}
}