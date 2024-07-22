package StringKunal;

public class defangingIPadd {
    static String defang(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch != '.'){
                sb.append(ch);
            }
            else{
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // String str = "1.1.1.1";
        // String s= "";
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //     if(ch != '.'){                       //USING STRING
        //        s+=ch;
        //     }
        //     else{
        //         s+="[.]";
        //     }
        // }
         String str = "1.1.1.1";
        System.out.print(defang(str));
    }
}
