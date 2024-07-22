import java.util.*;
public class add2No {
    public static int add(int a, int b){
        int c=a+b;
        return c;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
          
       int ans=  add(a,b);
        System.out.println("sum of two number is "+ans);
    }
    
}
