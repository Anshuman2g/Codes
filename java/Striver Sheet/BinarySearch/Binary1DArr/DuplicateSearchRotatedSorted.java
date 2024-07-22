package Binary1DArr;
public class DuplicateSearchRotatedSorted {
    static boolean ans(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[med]==target){
                return true;
            }
            if(arr[st]==arr[med]&&arr[med]==arr[end]){
                st++;
                end--;
                continue;
            }
                if(arr[st]<=arr[med]){
                    if(arr[st]<=target&& target<=arr[med]){
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
        return false;
    }
    public static void main(String[] args) {
        int[]arr={1,0,1,1,1};
        int target=0;
        System.out.println(ans(arr,target));
    }
}
