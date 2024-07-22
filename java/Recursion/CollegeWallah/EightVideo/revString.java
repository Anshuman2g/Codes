package CollegeWallah.EightVideo;

public class revString {
    static String rev(String s , int idx){
      if(idx == s.length()) return " ";
      return rev(s,idx+1) + s.charAt(idx);
    }
    public static void main(String[] args) {
        String s = "dcba";
        System.out.println(rev(s,0));
    }
}
