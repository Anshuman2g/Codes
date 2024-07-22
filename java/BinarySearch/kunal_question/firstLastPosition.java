package kunal_question;

public class firstLastPosition {
    static int[] position(int[]nums,int target){
    int st=0;
    int end=nums.length-1;
    int[]ans={-1,-1};
    while(st<=end){
        int med=st+(end-st)/2;
        if(nums[med]==target){
            ans[0]=med;
            end=med-1;
        }
        else if(nums[med]>target){
            end=med-1;
        }
        else{
            st=med+1;
        }
    }

      st=0;
    end=nums.length-1;
    while(st<=end){
       int med=st+(end-st)/2;
        if(nums[med]==target){
                    ans[1]=med;
                    st=med+1;
        }
        else if(nums[med]>target){
            end=med-1;
        }
        else{
            st=med+1;
        }
    }
              return ans;
    }
    public static void main(String[] args) {
      int[]nums = {5,7,7,7,7,7,8,8,10};
      int target = 7;
                      int[]k=position(nums,target);
                      for(int i=0;i<nums.length;i++){
                        System.out.println(k[i]);
                      }
    }
}
