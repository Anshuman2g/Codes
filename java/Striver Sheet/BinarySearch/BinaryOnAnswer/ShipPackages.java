package BinaryOnAnswer;

public class ShipPackages {

    static int mindays(int[]arr,int m,int d){
        int days=1;
        int load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>m){
                days+=1;
                load=arr[i];
            }
            else{
               load+=arr[i];
            }
        }
        return days;
    }

    static int rangeans(int[]arr,int d){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
           max=Math.max(max,arr[i]);
           sum+=arr[i];
        }

        for(int m=max;m<=sum;m++){
              if(mindays(arr,m,d)<=d){
                return m;
              }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        System.out.println(rangeans(arr,d));
    }
}
