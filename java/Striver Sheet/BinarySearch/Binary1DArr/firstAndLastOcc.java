package Binary1DArr;
public class firstAndLastOcc {
    static int[]occ(int[]arr,int k){
        int st=0;
        int end=arr.length-1;
        int []ans={-1,-1};
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[med]==k){
                ans[0]=med;
                end=med-1;
            }
            else if(arr[med]<k){
               st=med+1;
            }
            else if(arr[med]>k){
               end=med-1;
            }
        }
        
       st=0;
       end=arr.length-1;
       while(st<=end){
        int med=st+(end-st)/2;
        if(arr[med]==k){
            ans[1]=med;
            st=med+1;
        }
        else if(arr[med]<k){
            st=med+1;
        }
        else if(arr[med]>k){
            st=med+1;
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int[]arr={0 ,0 ,1 ,1 ,2 ,2 ,2 ,2};
        int k=2;
        int[]ans=occ(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
        
    }
}
