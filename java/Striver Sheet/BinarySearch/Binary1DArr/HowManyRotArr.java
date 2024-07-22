package Binary1DArr;
public class HowManyRotArr {
    static int rotcount(int[]arr){
        int st=0;
        int end=arr.length-1;
        int min=Integer.MAX_VALUE;
        int index=0;
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[st]<=arr[med]){
                if(arr[st]<min){
                    index=st;
                    min=arr[st];
                }
                st=med+1;
            }
            else if(arr[med]<=arr[end]){
                if(arr[med]<min){
                    index=med;
                    min=arr[med];
                }
                end=med-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2,3};
           System.out.println(rotcount(arr));
    }
}
