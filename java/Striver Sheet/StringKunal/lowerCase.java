public class lowerCase {
    public static void main(String[] args) {
        String s = "Hello";
       String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int asci = (int)ch;
            if(asci>=65 && asci<=90){
                asci+=32;
                char d= (char)asci;
                ans+=d;
            }
            else{
              ans+=s.charAt(i);
            }
        }
       System.out.println(ans);
    }
}
