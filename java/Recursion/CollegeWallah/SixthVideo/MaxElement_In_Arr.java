package CollegeWallah.SixthVideo;

public class MaxElement_In_Arr {
    // static int max=0;
    // public static int no(int[]arr,int i){
    //     if(i == arr.length) return max;
    //     if(arr[i]>max) max=arr[i];           //static variable
    //    return no(arr,i+1);
    // }

    // public static int no(int[]arr,int idx){
    //     return helper(arr,idx,0);               //through helper function
    // }
    // public static int helper(int[]arr,int i,int max){
    //     if(i == arr.length) return max;
    //    max=Math.max(arr[i],max);
    //     return helper(arr,i+1,max);
    // }
    
    public static int no(int[]arr,int idx){
        if(idx == arr.length-1) return arr[idx];  //comparing arr[i] && arr[i+1]
        int above = no(arr,idx+1);
        return Math.max(arr[idx],above);
    }
    public static void main(String[] args) {
        int[]arr={3,21,5,67};
        System.out.println(no(arr,0));
    }
}
