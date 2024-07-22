package Easy;
import java.util.*;
public class MissingNumArr {
    static int missingnum(int[]arr,int N){
        int Sums1=N*(N+1)/2;
        int Sums2=0;
        for(int i=0;i<N-1;i++){
            Sums2+=arr[i];
        }
        int missnum=Sums1-Sums2;
        return missnum;
    }
   public static void main(String[] args) {
    int N=5;
    int[]arr={1,2,3,5};
   int k= missingnum(arr,N);
   System.out.println(k+"is the missing number");
   }
    }

