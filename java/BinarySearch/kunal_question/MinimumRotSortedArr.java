package kunal_question;

public class MinimumRotSortedArr {
    static int min(int[]arr){
        int st=0;
        int end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(st<=end){
            int med= st+(end-st)/2;
            if(arr[st]<=arr[med]){
                ans=Math.min(ans,arr[st]);
                st=med+1;
            }
            else if(arr[med]<=arr[end]){
                ans=Math.min(ans,arr[med]);
                end=med-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={5,4,1,2,3};
        System.out.println(min(arr));
    }
}
