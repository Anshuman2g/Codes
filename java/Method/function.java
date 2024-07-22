import java.util.*;

 public class function{
    public static void printMyName(String name){
    System.out.println(name);                    //here we made our function
    return;
    }
    public static void main (String[]args){
              Scanner sc=new Scanner(System.in);
              String name=sc.nextLine();
              printMyName(name);          //yah function ko call kiya
    }
 }
