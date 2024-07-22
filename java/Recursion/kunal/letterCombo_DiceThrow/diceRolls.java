package letterCombo_DiceThrow;

import java.util.ArrayList;
import java.util.Scanner;

public class diceRolls {
    // static void dice(String p , int target){
    //     if(target == 0){
    //         System.out.println(p);
    //         return;
    //     }
    //     for(int i=1;i<=target;i++){
    //       dice(p+i,target-i);
    //     }
    // }

    static ArrayList<String> dice(String p , int target,int n){
        ArrayList<String>ls = new ArrayList<>();
        if(target == 0){
            ls.add(p);
            return ls;
        }
        for(int i=1;i<=target && i<=n;i++){
          ArrayList<String> ans =dice(p+i,target-i,n);
          ls.addAll(ans);
        }
        return ls;
    }
    public static void main(String[] args) {
        // dice("",4);
       ArrayList<String>ans = dice("",4,4);
       System.out.println( ans);
    }
}
