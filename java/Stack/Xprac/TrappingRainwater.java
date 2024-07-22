package Xprac;
import java.util.*;
public class TrappingRainwater {
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int mx=0;
        int[]lft=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            mx=Math.max(mx,arr[i]);
            lft[i]=mx;
        }
        int mx2=0;
        int[]rt=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            mx2=Math.max(mx2,arr[i]);
            rt[i]=mx2;
        }
          int ttwater=0;
          for(int i=0;i<arr.length;i++){
            int min=Math.min(lft[i],rt[i]);
            int ans= min- arr[i];
            if(ans>0){
                ttwater+=ans;
            }
          }
          System.out.println(ttwater);
    }
}
