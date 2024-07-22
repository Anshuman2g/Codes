import java.util.*;
public class StringBuild {

    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("hello");

        //to add something in StringBuilder we use str.append
        str.append("world");
        System.out.println(str);

        //to change something in StringBuilder we use ste.setCharAt(0,f);
        str.setCharAt(0,'m');
        System.out.println(str);

        //To inset something we use str.insert(0,'m');
        str.insert(3,'q');
        System.out.println(str);

        //To delete something
        str.deleteCharAt(0);
        System.out.println(str);  

        //reverse function
        str.reverse();
        System.out.println(str); 

        // delete start index and end index
        str.delete(0,8);
        System.out.println(str);
    }
}
