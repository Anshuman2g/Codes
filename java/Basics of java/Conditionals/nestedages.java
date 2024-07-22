import java.util.Scanner;
public class nestedages{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age of ram");
        int ram=sc.nextInt();
         System.out.println("enter age of sham");
        int sham=sc.nextInt();
         System.out.println("enter age of ajay");
        int ajay=sc.nextInt();
        if(ram<sham){
            if(ram<ajay){
                System.out.println(ram+"is youngest");
            }
            else{
                System.out.println(sham+"is youngest");
            }
            if(ajay<ram){
                if(ajay<sham){
                    System.out.println(ajay+"is youngest");
                }
                else{
                    System.out.println(sham+"is youngest");
                }
            }
        }
    }
}