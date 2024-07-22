package lambdaCollectionSort;
import java.util.*;
public class ArrList_lambdaExp {
    public static void main(String[] args) {
        Integer[]arr= {1,2222,34,555,-111};
        ArrayList<Integer>ls = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(ls,(a,b)->{
            return b-a;
        });
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}
