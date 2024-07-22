package CollegeWallah.EightVideo;

public class palindrome {
    // static String pal(String s,int i){
    //      if( i == s.length()) return "";
    //      return pal(s,i+1) + s.charAt(i);           //reverse method

    // }

    static boolean pal(String s,int l,int r){
     if(l>=r) return true;
    //  if(s.charAt(l) != s.charAt(r)) return false;
     return s.charAt(l) == s.charAt(r) && pal(s,l+1,r-1);
    }
    public static void main(String[] args) {
        String s = "el";
        // System.out.println(pal(s,0).equals(s));


        System.out.println(pal(s,0,s.length()-1));
    }
}
