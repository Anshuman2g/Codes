package Arrays;

public class rotatedBinarySearch {
    static int bs(int[]arr,int target,int st,int end){
            if(st>end) return -1;
            int med = st+(end-st/2);
            if(arr[med] == target) return med;
            if(arr[st]<=arr[med]){
                if(target>=arr[st] && target<=arr[med]){
                    return bs(arr,target,st,med-1);
                }
                else{
                    return bs(arr,target,med+1,end);
                }
            }
           
           else if(target>=arr[med] && target<=arr[end]){
                return bs(arr,target,med+1,end);
            }
            else{   
                return bs(arr,target,st,med-1);
            }
       
    }
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2,3};
        System.out.println(bs(arr,7,0,arr.length-1));
    }
}
