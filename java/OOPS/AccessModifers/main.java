package AccessModifers;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        A obj = new A(3, "ram");
        System.out.println(obj.n); // n is private accessible inside own file only bec its private
        obj.getn(); // with the help of getter we can access it outside any anothe file
        obj.setn(423);

        
    }
}
