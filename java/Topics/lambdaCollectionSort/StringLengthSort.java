package lambdaCollectionSort;
import java.util.*;
public class StringLengthSort {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<>();
        ls.add("hello");
        ls.add("naaa");
        ls.add("jal");
        ls.add("ra");

        Comparator<String> com = new Comparator<String>() 
        {
                       public int compare (String a, String b){
                        if(a.length()>b.length()){
                            return 1;
                        }
                        else if (a.length() < b.length()) {
                            return -1;
                        }
                        // Return zero if 'a' and 'b' have the same length
                        return 0;
                    }
                       
        };
        Collections.sort(ls,com);
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}
