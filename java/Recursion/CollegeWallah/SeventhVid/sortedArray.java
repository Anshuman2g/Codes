package CollegeWallah.SeventhVid;

public class sortedArray {
    static boolean no(int[]arr,int idx){
        if(idx == arr.length-1) return true;
        if(arr[idx]>arr[idx+1]) return false;
        return no(arr,idx+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,33,4,5};
        System.out.println(no(arr,0));
    }
}
