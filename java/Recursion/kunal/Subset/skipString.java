package Subset;

public class skipString {
    // static String skp(String str){
    //     if(str.isEmpty()){
    //         return "";
    //     }
    //     if(str.startsWith("apple")){
    //         return skp(str.substring(5));
    //     }
    //     else{
    //         return str.charAt(0) + skp(str.substring(1));
    //     }
    // }

    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        else{
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }

    public static void main(String[] args) {
        // String s="helloapplebyee";
        // System.out.println(skp(s));
        
        String s="helloapplebyee";
        System.out.println(skipAppNotApple(s));

        String s2="helloappbyee";
        System.out.println(skipAppNotApple(s2));
    }
}
