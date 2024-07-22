import java.util.Scanner;
public class nested {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int empid=sc.nextInt();
        String dep =sc.next();
        switch(empid){
            case 1: System.out.println("rahul");
            break;
            case 2:System.out.println("ram");
            break;
            case 3:
            switch(dep){
                case "IT" :System.out.println("IT is here");

                break;
                case "managment" :System.out.println("managment is here");
                break;
                default:
                System.out.println("no departement entered");
            

            }
        }
    }
    
}
