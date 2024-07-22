package Easy;
import java.util.*;
public class MaxConsecutiveOne {
    static int max(int[]arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count =0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int answer=max(arr);
        System.out.println(answer+" is the maximum consecutive 1 in given array");

    }
}
