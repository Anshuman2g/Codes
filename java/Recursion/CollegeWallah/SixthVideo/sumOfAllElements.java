package CollegeWallah.SixthVideo;

public class sumOfAllElements {
    // static int ans=0;
    // public static int no(int[]arr,int i){
    //     if(i == arr.length) return ans;
    //     ans+=arr[i];                     //Through static variable
    //     return no(arr,i+1);
    // }

    // -------------------------------------------------------------------------------------------/
    // public static int no(int[]arr,int idx){
    //     return helper(arr,idx,0);
    // }
    // public static int helper(int[]arr,int idx, int ans){
    //     if(idx == arr.length) return ans;
    //     ans+=arr[idx];
    //    return helper(arr,idx+1,ans);
    // }

    // --------------------------------------------------------------------------------------------
      public static int no(int[]arr,int idx){
           if(idx == arr.length-1) return arr[idx];
           return no(arr,idx+1) + arr[idx];
      }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(no(arr,0));
    }
}
