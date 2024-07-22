package HashSet;
import java.util.*;
public class Syntax {
    public static void main(String[] args) {
        HashSet<String>st=new HashSet<>();
        st.add("raa");
        st.add("paa");
        st.add("raa");
        System.out.println(st);  //raa paa 
        System.out.println(st.contains("raa")); //true
        System.out.println(st.size());           //2
           st.remove("raa");        //removed raa
           st.add("waa");   //add waa
           st.add("ooo");   //add ooo

        //traverse through set
        for(String s : st){
            System.out.println(st);            //print raa waa ooo
        }
    }
}
