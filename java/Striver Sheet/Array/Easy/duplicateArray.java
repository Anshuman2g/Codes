package Easy;
import java.util.*;
public class duplicateArray {
    static int noDuplicate(int[]arr){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){      //ek function banya usme hashset lgta kioki koi duplicate na ho is for loop mh
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
         for(int x: set){
            arr[j++]=k;
         }
        return k;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the length of array");
       int n=sc.nextInt();
       int[]arr=new int[n];
       System.out.println("enter the elements of array");
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
       int k=noDuplicate(arr);
       for(int i=0;i<k;i++){
        System.out.println(""+ arr);
       }


    }
}
