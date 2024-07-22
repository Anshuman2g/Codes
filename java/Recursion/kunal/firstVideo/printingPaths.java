package firstVideo;
import java.util.*;
public class printingPaths {
    // static void path(String p,int r,int c){
    //     if(r== 1 && c ==1){
    //         System.out.println(p);
    //         return;
    //     }
    //    if(r>1){
    //     path(p+'D',r-1,c);
    //    }
    //   else {
    //     path(p+'R',r,c-1);
    //    }
    // }

    static ArrayList<String> path(String p,int r,int c){
        ArrayList<String>ls = new ArrayList<>();
        if(r== 1 && c ==1){
            ls.add(p);
            return ls;
        }
       if(r>1){
       ArrayList<String> ans= path(p+'D',r-1,c);
       ls.addAll(ans);
       }
      if(c>1) {
        ArrayList<String>ans=path(p+'R',r,c-1);
        ls.addAll(ans);
       }
       return ls;
    }
    public static void main(String[] args) {
        // path("",3,3);
        ArrayList<String>ans =  path("",3,3);
        System.out.println(ans);
    }
}
