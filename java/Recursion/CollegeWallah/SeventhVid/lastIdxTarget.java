package CollegeWallah.SeventhVid;

public class lastIdxTarget {
    static int no(int[]arr,int x,int idx){
           if(idx == -1) return -1;
           if(arr[idx] == x) return idx;
           return no(arr,x,idx-1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,23,2};
        int x=2;
        System.out.println(no(arr,x,arr.length-1));
    }
}
