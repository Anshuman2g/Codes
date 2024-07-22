package lambdaCollectionSort;
import java.util.*;
public class ArraylambdaExp {
    public static void main(String[] args) {
        Integer[]arr={1,5,2,7,8,666,6};
        Arrays.sort(arr,(a,b) ->{
            return b-a;
        });
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        } 
    }
}
