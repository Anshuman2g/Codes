package kunal_question;

public class peak_Index {
    static int peakno(int[]arr){
        int st=0;
        int end=arr.length-1;
        int ans=0;
        while(st<=end){
            int med=st+(end-st)/2;
            if(arr[med]>arr[med+1]){
                  ans=med;
                  end=med-1;
            }
            else{
                st=med+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,3,2,1};
              int ans=peakno(arr);
              System.out.println(ans);
    }
}
