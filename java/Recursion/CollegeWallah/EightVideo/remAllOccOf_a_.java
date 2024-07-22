package CollegeWallah.EightVideo;

public class remAllOccOf_a_ {
    //  static String str(String s,String ans,int i){
    //     if(i == s.length()){
    //         return ans;
    //     } 
    //     if(s.charAt(i) != 'a'){
    //         return str(s,ans+=s.charAt(i),i+1);
    //     }
    //     else{
    //         return str(s,ans,i+1);
    //     }
    // }
    static String str(String s, int i){
        if(i == s.length()) return "";
        if(s.charAt(i) != 'a'){
            return s.charAt(i)+str(s,i+1);   //time complexity o(n^2) see everytime a new string is added to a character so..
        }                                    //if a character is added to a string it would be then o(n)
        else{
            return str(s,i+1);
        }
    }
    public static void main(String[] args) {
        String s = "abcax";
        // String ans="";
        // System.out.println(str (s,ans,0));

        System.out.println(str (s,0));
    }
}
