public class Substring {
    public static void main(String[] args) {
        String str="abc";
    //     System.out.println(str.substring(0,9));
    //     System.out.println(str.substring(4));
            for(int i=0;i<str.length();i++){
                for(int j=i+1;j<=str.length();j++){
                    System.out.println(str.substring(i,j));
                }
            }

    }
}
