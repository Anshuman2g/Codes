import java.util.*;
public class reverseWordInString {
    public static void main(String[] args) {
        // String str = " i am educator";
        // String ans =" ";
        // StringBuilder sb= new StringBuilder("");
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if( ch != ' '){
        //         sb.append(ch);
        //     }
        //     else{
        //         sb.reverse();
        //         ans+=sb;
        //         ans+=" ";
        //         sb = new StringBuilder(" ");
        //     }
        // }
        //   sb.reverse();
        //   ans+=sb;
        // System.out.println(ans);

        String str="i am educator";
        StringBuilder sb= new StringBuilder(" ");
        String ans=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             if(ch != ' '){
                sb.append(ch);
             }
             else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder(" ");
             }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
