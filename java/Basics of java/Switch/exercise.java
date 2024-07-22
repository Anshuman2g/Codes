import java.util.Scanner;
public class exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exercise = sc.next();

        switch(exercise){
            case"monday" ->System.out.println("chest +  triceps");
            case"tuesday" ->System.out.println("back + biceps");
            case"wednesday" ->System.out.println("legs");
        }
    }
    
}
