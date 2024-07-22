package CollegeWallah.SeventhVid;

public class XexistInArrayOrNot {
    // public static boolean no(int[]arr,int x , int idx){
    //     if(idx == arr.length) return false;                //returning true or false
    //     if(arr[idx] == x) return true;
    //     return no(arr,x,idx+1);
    // }

    public static int no(int[]arr,int x , int idx){    //returning the index here
        if(idx == arr.length) return -1;
        if(arr[idx] == x) return idx;
        return no(arr,x,idx+1);
    }
    public static void main(String[] args) {
        int[]arr={4,12,54,14,3,8,6,1};
        int x =3;
        System.out.println(no(arr,x,0));
    }
}
