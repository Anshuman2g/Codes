package Binary1DArr;
public class MinimumRotatedSorted {
    static int min(int[]arr){
        int st=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int med=st+(end-st)/2;
                 if(arr[st]<arr[med]){
                    ans=Math.min(arr[st],ans);
                    st=med+1;
                 }
                else if(arr[med]<=end){
                    ans=Math.min(arr[med],ans);
                    end=med-1;
                 }

        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2,3};
       System.out.println(min(arr));
    }
}
