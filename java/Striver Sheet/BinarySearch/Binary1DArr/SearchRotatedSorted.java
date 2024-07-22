package Binary1DArr;
public class SearchRotatedSorted {
    static int search(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[med]==target){
                return med;
            }
            if(arr[st]<=arr[med]){
                if(arr[st]<=target  && target<=arr[med]){
                    end=med-1;
                }
                else{
                    st=med+1;
                }
            }
            else if(arr[med]<=arr[end]){
               if(arr[med]<=target&&target<=arr[end]){
                    st=med+1;
                }
                else{
                    end=med-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[]arr= {4,5,6,7,0,1,2};
       int target = 0;
       int ans=search(arr,target);
       System.out.println(ans);
    }
}
