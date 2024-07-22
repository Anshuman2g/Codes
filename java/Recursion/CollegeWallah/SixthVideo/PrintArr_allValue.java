package CollegeWallah.SixthVideo;

public class PrintArr_allValue {
    public static void no(int[]arr,int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        no(arr,idx+1);
    }

    //    static int idx=0;
    // public static void no(int[]arr){
    //     if(idx == arr.length){ 
    //         return;
    //     }
    //     System.out.println(arr[idx]);
    //     idx = idx+1;
    //     no(arr);
    // }


    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        no(arr,0);


        // int[]arr={1,2,3,4,5};
        // no(arr);
    }
}
