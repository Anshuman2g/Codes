package Subset;

import java.util.*;

public class subseq {
    // static void ss(String u,String p){         //unprocessed processed
    //     if(p.isEmpty()){
    //         System.out.println(u);
    //         return;
    //     }
    //      ss(u+p.charAt(0),p.substring(1));
    //      ss(u,p.substring(1));
    // }
    // static ArrayList<String> ss(String u,String p ,ArrayList<String>ls){
    //      if(p.isEmpty()){                           
    //        ls.add(u);
    //        return ls;                            //list passed as argument
    //      }
    //      char ch = p.charAt(0);
    //      String Substring=p.substring(1);
    //       ss(u+ch,Substring,ls);
    //       ss(u,Substring,ls);
    //       return ls;
    // }

    static ArrayList<String>ss(String u,String p){
      ArrayList<String>ls = new ArrayList<>();
      if(p.equals("")){
          ls.add(u);
          return ls;
        }
           char ch = p.charAt(0);
           String Substring=p.substring(1);
           ArrayList<String>left = ss(u+ch,Substring);
           ArrayList<String>right = ss(u,Substring);
           left.addAll(right);
           return left ;
    }
    public static void main(String[] args) {
        // ArrayList<String>ls = new ArrayList<>();
        System.out.println(ss("","abc"));
    }
}
