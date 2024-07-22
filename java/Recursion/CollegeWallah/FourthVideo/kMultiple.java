package CollegeWallah.FourthVideo;

import java.util.ArrayList;

public class kMultiple {

    public static void no(int num,int k){
        if(k == 1) {
            System.out.println(num);
            return;
        }
        no(num,k-1);
        System.out.println(num*k);

    }
    // static ArrayList<Integer>ls = new ArrayList<>();
    // public static int no(int num,int k){
    //     if(k==1) {      
    //         ls.add(num);
    //         return num;
    //     }
    //     int kk= no(num,k-1)+num ;
    //     ls.add(kk);
    //     return kk;
    // }
    public static void main(String[] args) {
        int num =5;
        int k=4;
        // System.out.println(no(num,k));
        // System.out.println(ls);
        no(num,k);
    }
}
