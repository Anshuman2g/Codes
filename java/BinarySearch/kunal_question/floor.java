package kunal_question;

public class floor {
    static int smallestequal(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        //smallest equal than target but largest in arr
        while(st<=end){
            int med=st + (end-st)/2;
            if(arr[med]<=target){
                st=med+1;
            }
            else{
                end=med-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[]arr={1,2,5,8,11,15,19};
        int target = 16;
        int ans = smallestequal(arr,target);
        System.out.println(ans);
    }
}
