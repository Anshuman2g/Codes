package Binary1DArr;
public class searchInsertPosition {
    static int insert(int[]arr,int x){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[med]==x){
                ans=med;
                break;
           }
          else if(arr[med]>x){
            ans=med;
            end=med-1;
           }
           else if(arr[med]<x){
            st=med+1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr= {1,2,4,7};
        int x=6;
        System.out.print(insert(arr,x));
    }
}
