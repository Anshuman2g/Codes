import java.util.Scanner;

public class fruit {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    String fruit= sc.nextLine();

    //    switch (fruit){
    //     case "mango":
    //     System.out.println("king of fruits");
    //     break;
    //     case "apple":
    //     System.out.println("red  fruits");
    //     break;
    //     case "banana":
    //     System.out.println("yellow fruits");
    //     break;
    //     default:
    //     System.out.println("please enter a valid fruit");
    //    }




    //    NEW SWITCH METHOD
                switch (fruit){
                    case "mango" ->System.out.println("king");
                    case "apple" ->System.out.println("red");
                    case "banana" ->System.out.println("yellow");
                }
            }
}


