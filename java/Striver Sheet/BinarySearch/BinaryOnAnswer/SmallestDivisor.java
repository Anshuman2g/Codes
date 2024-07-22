package BinaryOnAnswer;

public class SmallestDivisor {
    static int divisorno(int[]arr,int limit,int med){
         int smallno=0;
         for(int i=0;i<arr.length;i++){
            smallno+=Math.ceil((double)arr[i]/med);
         }
         if(smallno<=limit){
            return med;
         }
         return -1;
    }

    static int smallno(int[]arr,int limit){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }

        int st=min;
        int end=max;
        int smallno=0;
        while(st<=end){
            int med=st+(end-st)/2;
            int ans=divisorno(arr,limit,med);
            if(ans!=-1){
              smallno=med;
              end=med-1;
            }
            else{
                st=med+1;
            }
        }
        return smallno;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int limit = 8;                               //esa no jo array ke sare elemnts se divide 
                                                  //kru aur uska sum kru uska answer limit sh kamm aya ja equal
       System.out.println(smallno(arr,limit));
    }
}
