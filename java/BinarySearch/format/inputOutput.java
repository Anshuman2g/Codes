package format;
public class inputOutput{
    static boolean binarysearch(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid= (st+end)/2;
            if(target == mid){
                return true;
            }
            else if(target<mid){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int target=4;

        System.out.println(binarysearch(arr,target));
    }
}