import java.util.*;
public class StringIntChar {
    public static void main(String[] args) {
        //ADDING STRING ---------
        // String str="Hello";
        // str+="dello";
        // System.out.println(str);


        //ADDING CHAR------------
        // String str="Hello";
        // str+='s';
        // System.out.println(str); 


        //ADDING INT
        // String str="Hello";
        // str+=11;
        // System.out.println(str);
         

        //hello --> heylo   //though java is immutable we can change sometimes like this
        String str="hello";
        System.out.println(str.substring(0,2) + 'y' + str.substring(3));
    }
}
