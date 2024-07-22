import java.util.Scanner;
public class percentage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
        int number=sc.nextInt();
        if(number>91){
            System.out.println("A");
        }
        
         else if(number>81){
            System.out.println("B");
        }
          else if(number>71){
            System.out.println("C");
        }
          else{
            System.out.println("D");
        }
    }
}