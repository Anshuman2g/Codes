package Aditya_Verma;

public class TappingRainwaterr {
    public static void main(String[] args) {
        int[]arr= {0,1,0,2,1,0,1,3,2,1,2,1};
        int[]left= new int[arr.length];
        int[]right=new int[arr.length];
        int m1=0;
        for(int i=0;i<arr.length;i++){
            m1=Math.max(m1,arr[i]);
            left[i]=m1;
        }
        int m2=0;
        for(int i=arr.length-1;i>=0;i--){
            m2=Math.max(m2,arr[i]);
            right[i]=m2;
        }
        int ans=0;s
        for(int i=0;i<arr.length;i++){
            int minMax=Math.min(left[i],right[i]);
            int water=minMax-arr[i];
            if(water>0){
                ans+=water;
            }
        }
        System.out.println(ans);
    }
}
