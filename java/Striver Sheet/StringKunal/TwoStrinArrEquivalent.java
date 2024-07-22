public class TwoStrinArrEquivalent {
    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};    

       // WE HAVE TO CHECK IF THESE TWO STRING ARRAY HAVE SAME VALUE

       String s1="";
       String s2="";
       boolean flag=false;
       for(int i=0;i<word1.length;i++){
        s1+=word1[i];
       }
       for(int i=0;i<word2.length;i++){
        s2+=word2[i];
       }
       if(s1.equals(s2)){
      flag =true;
       }
       else{
        flag=false;
       }
       System.out.print(flag);
    }
}
