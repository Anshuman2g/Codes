import java.util.*;
public class PalindromicString {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        // StringBuilder gtr = new StringBuilder(str);
        // gtr.reverse();
        // if(str.toString().equals(gtr.toString())){                 //we using here StringBuilder 
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }

      
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
          int i=0;
          int j=str.length()-1;
          boolean flag=true;
          while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag=false;
                break;
            }
            else{
                i++;
                j--;
            }
          }
          if(flag == true) System.out.println("palindromic");
          else if(flag == false )  System.out.println("not palindromic");
    }
}
