import java.util.*;
public class Sort{
    public static void main(String[] args) {
        Integer[]arr={6,3,1,8,5,0};
        ArrayList<Integer> ls = new ArrayList(Arrays.asList(arr));   //Using this we can convert an arr to Arraylist
        Collections.sort(ls);
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}