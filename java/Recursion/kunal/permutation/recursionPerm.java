package permutation;

import java.util.ArrayList;

public class recursionPerm {
    static void pm(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
               pm(f + ch +s,up.substring(1));
        }
    }

//     static ArrayList<String> pm(String p , String up){
//         ArrayList<String> ls = new ArrayList<>();
//         if(up.isEmpty()){
//             ls.add(p);
//             return ls;
//         }
//         char ch = up.charAt(0);
//         for(int i=0;i<=p.length();i++){
//             String f = p.substring(0, i);
//             String s = p.substring(i,p.length());
//           ls= pm(f + ch +s,up.substring(1));
//         }
//         return ls;
//   }


    // static int pm(String p , String up){
    //     if(up.isEmpty()){
    //         return 1;
    //     }
    //     int count=0;
    //     char ch = up.charAt(0); 
    //     for(int i=0;i<=p.length();i++){
    //         String f = p.substring(0, i);
    //         String s = p.substring(i,p.length());
    //      count = count + pm(f + ch +s,up.substring(1));
    //     }
    //     return count;
    // }
    public static void main(String[] args) {
        String s="abc";
         pm("",s);
    //   System.out.println(ans);
    }
}
