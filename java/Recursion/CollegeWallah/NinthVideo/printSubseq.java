package CollegeWallah.NinthVideo;

import java.util.ArrayList;

public class printSubseq {
    static ArrayList<String> ss(String str){
        ArrayList<String>ls = new ArrayList<>();
       if(str.length() == 0){
        ls.add(" ");
        return ls;
       }
        char ch = str.charAt(0);
        ArrayList<String>ls2 =(ss(str.substring(1)));
      
        for(var e : ls2){
            ls.add(e);
            ls.add(ch+e);
        }
        return ls;
    }
  
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(ss(str));
       
    }
}
