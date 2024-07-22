package Array3;
import java.util.*;
public class TripletSumX {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        int x=sc.nextInt();
        int count=0;
        System.out.println("enter the length of aray");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            for(int j=0;j<arr.length;j++){
                for(int k= j+1;k<arr.length;k++){
                    for(int l=k+1;l<arr.length;l++){

                        if( x == arr[j]+arr[k]+arr[l]){
                            count++;
                        }
                    }
                    
                }
            }
 System.out.println("the triplets are matching value of x is"+count);
        }
        
    }