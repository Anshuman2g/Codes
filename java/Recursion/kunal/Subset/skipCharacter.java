package Subset;

public class skipCharacter {
    // static void rem(String str,String ans){
    //     if(str.isEmpty()) {
    //         System.out.println(ans);
    //     return;
    //     }
    //     if(str.charAt(0) != 'a'){
    //        rem(str.substring(1),ans+str.charAt(0));
    //     }
    //     else{
    //        rem(str.substring(1),ans);
    //     }
    // }

    static String rem(String str){
        if(str.isEmpty()) {
        return " ";
        }
        if(str.charAt(0) != 'a'){
            return str.charAt(0)+ rem(str.substring(1));
        }
        else{
           return rem(str.substring(1));
        }
    }

    
    public static void main(String[] args) {
        String s = "abaca";
        
        //  rem(s,"");

         System.out.println(rem(s));
    }
}
