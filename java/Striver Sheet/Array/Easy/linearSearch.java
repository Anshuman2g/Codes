package Easy;
import java.util.Scanner;
public class linearSearch {
    static int num(int[]arr,int nums){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums){
                 j=i;
            }
        }
        return j;
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
        System.out.println("enter the value of nums");
        int nums=sc.nextInt();
            int k =num(arr,nums);
            System.out.println("the index is " +k);
    }
}
