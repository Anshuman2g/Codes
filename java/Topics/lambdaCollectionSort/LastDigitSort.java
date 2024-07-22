package lambdaCollectionSort;
import java.util.*;
public class LastDigitSort {
    public static void main(String[] args) {
        
        // ArrayList<Integer> ls = new ArrayList<>();
        // ls.add(33);
        // ls.add(51);
        // ls.add(62);                                  //Here We Did Simple sorting
        // Collections.sort(ls);
        //  for(int i=0;i<ls.size();i++){
        //     System.out.println(ls.get(i));
        //  }

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(33);
        ls.add(51);                                      //here we need to sort no on last digit 
        ls.add(62);   
                   
        Comparator<Integer> com = new Comparator<Integer> ()
        {
                       public int compare(Integer i ,Integer j){
                        if(i%10 > j%10){
                            return 1;
                        }
                        else{
                            return -1;
                        }
                       }
        };
        Collections.sort(ls,com);
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}
