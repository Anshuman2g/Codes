import java.util.*;
public class insertionSortRecursion {
    public static void main(String[] args) {
         ArrayList<Integer>ls = new ArrayList<>(Arrays.asList(3,2,4,1));
          sort(ls);
          System.out.println(ls);
    }
    static void sort( ArrayList<Integer>ls){
            if(ls.size() == 1 ){
                return;
            }
            int temp=ls.remove(ls.size()-1);
            sort(ls);
            insert(ls,temp);
    }
    static void insert( ArrayList<Integer>ls , int temp){
       if(ls.isEmpty() || ls.get(ls.size()-1) <= temp){
        ls.add(ls.size(),temp);
        return;
       }
       int val=ls.remove(ls.size()-1);
       insert(ls,temp);
       ls.add(val);
    }
}
