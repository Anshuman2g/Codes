package CollegeWallah.NinthVideo;

public class voidPrintSubseq {
    static void ss(String s , String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
       ss(s.substring(1),ans+s.charAt(0));
       ss(s.substring(1),ans); 
    }
        public static void main(String[] args) {
        ss("Abc"," ");
    }
}
