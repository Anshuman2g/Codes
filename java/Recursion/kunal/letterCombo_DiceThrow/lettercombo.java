package letterCombo_DiceThrow;

import java.util.ArrayList;

public class lettercombo {
    // static void pad(String p , String u){
    //     if(u.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     int digit=u.charAt(0) - '0';
    //     for(int i = (digit-1)*3;i<digit*3;i++){
    //         char ch = (char) (i+'a');
    //         pad(p+ch,u.substring(1));
    //     }
    // }

    static ArrayList<String> pad(String p , String u){
        ArrayList<String>ls = new ArrayList<>();
        if(u.isEmpty()){
            ls.add(p);
            return ls;
        }
        int digit=u.charAt(0) - '0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char) (i+'a');
           ArrayList<String>ans= pad(p+ch,u.substring(1));
           ls.addAll(ans);
        }
        return ls;
    }

    // static int pad(String p , String u){
    //     ArrayList<String>ls = new ArrayList<>();
    //     if(u.isEmpty()){
    //        return 1;
    //     }
    //     int count=0;
    //     int digit=u.charAt(0) - '0';
    //     for(int i = (digit-1)*3;i<digit*3;i++){
    //         char ch = (char) (i+'a');
    //       count = count +pad(p+ch,u.substring(1));
    //     }
    //     return count;
    // }
    public static void main(String[] args) {
        System.out.println(pad("","12"));
    }
}
