package kunal_question;

public class positionInfiniteSorArr {
    static int findingrange(int[]arr,int target,int st,int end){
         st=0;
         end=1;
        
            while (arr[end]<target){
              int  newst=end+1;
              //double the size of box  and moving end double time
              end = end + (end-st+1)*2;
                  st=newst;
            }
      
         return findingtarget(arr,target,st,end);
    }

    static int findingtarget(int[]arr,int target,int st,int end){
                        while(st<=end){
                            int med= st+(end-st)/2;
                            if(arr[med]<target){
                                st=med+1;
                            }
                            else if(arr[med]>target){
                                end=med-1;
                            }
                            else{
                                //target found at equal to
                                return med;
                            }

                        }
                        return -1;
    }
    public static void main(String[] args) {
        int[]arr={3,5,7,10,90,100,111,1111};
        int target =10;
        int st=0;
        int end=1;
        int ans=findingrange(arr,target,st,end);
        System.out.println(ans);
    }
}
