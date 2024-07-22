import java.util.Scanner;
public class square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vaue both for l and b");
        int l,b;
         l=sc.nextInt();
         b=sc.nextInt();
        if(l==b){
            System.out.println("this is a square");
        }
    }
}