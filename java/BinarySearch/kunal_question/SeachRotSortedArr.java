package kunal_question;

public class SeachRotSortedArr {
    static int searchrotarr(int[]arr,int target){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int med=st + (end-st)/2;
            if(arr[med]==target){
                return med;
            }
            // if(arr[st]==arr[med]&&arr[med]==arr[end]){
            //     st++;
            //     end--;
            //     continue; 
            // }  


                    // this upper one if for if we have duplicate value

            if(arr[st]<=arr[med]){
                if(arr[st]<=target && target<=arr[med]){
                    end=med-1;
                }
                else{
                    st=med+1;
                }
            }
            else{

                if(arr[med]<=arr[end]){
                    if(arr[med]<=target && target <= arr[end]){
                        st=med+1;
                    }
                    else{
                        end=med-1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(searchrotarr(arr,target));
    }
}
