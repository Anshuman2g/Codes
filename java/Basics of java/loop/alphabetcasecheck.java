import java.util.Scanner;
public class alphabetcasecheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);

        if(ch>='a' &&  ch<='b'){
            System.out.print("lowercase");
        }
        else
        System.out.print("upperrcase");
    }
}