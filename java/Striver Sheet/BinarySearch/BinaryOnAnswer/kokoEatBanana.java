package BinaryOnAnswer;

public class kokoEatBanana {
    static int max(int[]arr){
       int ans=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        ans=Math.max(ans,arr[i]);
       }
       return ans;
    }
    static int caltotalhours(int[]arr,int i){
        int totalhr=0;
        for(int m=0;m<arr.length;m++){
            totalhr+=Math.ceil((double)(arr[m])/(double)(i));
         }
        return totalhr;
    }

    static int minimumratetoeat(int[]arr,int h){
          int maxi=max(arr);
          for(int i=1;i<=maxi;i++){
             int reqtime=caltotalhours(arr,i);
             if(reqtime<=h){
                return i;                   //BRUTE FORCE METHOD
             }
          }
          return maxi;
    }
    public static void main(String[] args) {
        int[]arr={3,6,2,8};
        int h=7;
        int bananaeat=minimumratetoeat(arr,h);
        System.out.println(bananaeat);
    }
}
// https://leetcode.com/problems/koko-eating-bananas/description/