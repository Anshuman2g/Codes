import java.util.Arrays;
import java.util.HashSet;

public class subset {
    public static void main(String[] args) {
        int arr1[] = {11, 1, 13, 21, 3, 7};
        int arr2[] = {11, 3, 7, 201};
         HashSet<Integer>st = new HashSet<>();
         for(var e : arr1){
            st.add(e);
         }
           boolean flag=true;
         for(var e : arr2){
            if(!st.contains(e)){
                flag=false;
                System.out.println("false");
            }
         }
         if(flag){
       System.out.println("true");
         }
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // int i=0,j=0;
    // while(i<arr1.length && j<arr2.length){
    //     if(arr1[i]<arr2[j]){
    //         i++;
    //     }
    //     else if(arr1[i]>arr2[j]){
    //         j++;
    //     }
    //     else if(arr1[i] == arr2[j]){     
    //         i++;
    //         j++;
    //     } 
    // }
    //     System.out.println(j==arr2.length);
    }
}
