package lambdaCollectionSort;
import java.util.*;
public class String_LambdaExp {
    public static void main(String[] args) {
        String[] arr= {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        // Arrays.sort(arr, (a,b) ->{
        //   return  b.length()-a.length();
        // });
        System.out.println();

        Arrays.sort(arr, new Comparator<>() {
            public int compare(String a,String b){
                return a.length()-b.length();
            }
        });
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
 