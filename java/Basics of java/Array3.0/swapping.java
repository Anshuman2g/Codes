import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
         int z=a;    // a=1; b=2;      z=1; 
        a=b;                 // yhn hmne a kn b kn value dedi
        b=z;                 // yhn hmne b kn z kn value z mn a kn value store hn jo purani walii
        System.out.println("the vaue  a is" +a);
        System.out.println("the valur of b is" +b);
    }
}
