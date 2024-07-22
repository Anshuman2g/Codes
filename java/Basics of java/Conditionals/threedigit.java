import java.util.Scanner;
public class threedigit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("the given is three digit");
        }
        else{
            System.out.println("it is not three digit number");
        }
    }
}