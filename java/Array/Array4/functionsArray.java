package Array4;

import java.util.*;

public class functionsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        k = k % n;
        rotate(arr, 0, n-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr,int i,int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        
    }
}
