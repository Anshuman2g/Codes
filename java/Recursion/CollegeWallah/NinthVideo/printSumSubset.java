package CollegeWallah.NinthVideo;

public class printSumSubset {
    static void no(int[]arr,int i,int ans){
           if(i== arr.length){
            System.out.println(ans);
            return;
           }
          no(arr,i+1,ans+arr[i]);
          no(arr,i+1,ans);
    }
    public static void main(String[] args) {
        int[]arr={2,4,5};
         no(arr,0,0);
    }
}
