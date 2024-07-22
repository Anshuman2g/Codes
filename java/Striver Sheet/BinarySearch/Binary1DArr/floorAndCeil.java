package Binary1DArr;
public class floorAndCeil {
    static int[] larsmall(int[]arr,int x){
        int st=0;
        int end=arr.length-1;
        int[]ans={0,0};
          if(x<arr[st]){
            ans[0]=-1;
        }
        else if(x>arr[end]){
            ans[1]=-1;
        }
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[med]==x){
             ans[0]=x;
             ans[1]=x;
             break;
            }

             else if(arr[med]<x){
                ans[0]=arr[med];
                st=med+1;
             }
           else if(arr[med]>x){
                ans[1]=arr[med];
                end=med-1;
             }
      
            }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={3, 4, 4, 7, 8, 10};
        int x=2;
        int[]result=larsmall(arr,x);

        System.out.print(result[0]+" " +result[1]);
    }
}
