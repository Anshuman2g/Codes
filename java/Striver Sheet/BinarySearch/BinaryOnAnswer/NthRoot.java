package BinaryOnAnswer;

public class NthRoot {
    static int findN(int n,int m){
        int st=1;
        int end=m;
        int ans=-1;
        while(st<=end){
            int med=st+(end-st)/2;
            if(Math.pow(med,n)==m){
              return med;
            }
            else if(Math.pow(med,n)>m){
                end=med-1;
            }
            else if(Math.pow(med,n)<m){
                st=med+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        int m=28;
        System.out.println(findN(n,m));
    }
}
