import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
      int ans =sum();
      System.out.println(ans);
        
    }
    static int sum() {
          Scanner sc= new Scanner(System.in);
        int a,b,c;
       a =sc.nextInt();
       b= sc.nextInt();

       c =a+b;
      return c;
    }
}