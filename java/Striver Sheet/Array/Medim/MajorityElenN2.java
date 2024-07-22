package Medim;
import java.util.*;

public class MajorityElenN2 {

    static int majElem(int[]arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                return arr[i];
            }
        }
        return 1111111;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans=majElem(arr);
        System.out.println(ans+" is the majority element greater than n/2");
    }
}
