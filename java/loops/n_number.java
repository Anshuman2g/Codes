import java.util.Scanner;
public class n_number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the valur of n");
        int n=sc.nextInt();
        int num=1;
        while(num<=n){
            System.out.println(num);
            num =num+1;
        }
    }
}