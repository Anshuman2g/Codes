package BinaryOnAnswer;

public class SquareRootN {
    static int root(int n){
       int st=1;
       int end=n;
       int ans=0;
       while(st<=end){
        int med=st+(end-st)/2;
        if(med*med == n){
            return med;
        }
        else if (med*med>n){
            end=med-1;
        }
        else if(med*med<n){
            ans=med;
            st=med+1;
        }
       }
        return ans;
    }
    public static void main(String[] args) {
        // int n=26;
        // int ans=0;
        // for(int i=1;i<n;i++){
        //  if(i*i <= n){
        //     ans= i;
        //  }                    //BRUTE FORCE
        //  else {
        //  break;
        //  }
        // }
        // System.out.println(ans);

            int n=99;
            System.out.println(root(n));
    }
}
