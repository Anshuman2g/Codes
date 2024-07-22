import java.util.Scanner;
public class ageramsham{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of a");
        int a = sc.nextInt();
        System.out.println("enter the age of b");
        int b = sc.nextInt();
         System.out.println("enter the age of c");
        int c = sc.nextInt();
        if (a<b && a<c){
            System.out.println(a+ "is youngest");
        }
         else if (b<a && b<c){
            System.out.println(b+ "is youngest");
        }
        else{
            System.out.println(c+ "is youngest");
        }
        
    }
}