package kunal_question;

public class greaterValueTarget {
    static char greatvalue(char[]letter,int target){
        int st=0;
        int end=letter.length-1;
        while(st<=end){
            int med=st + (end-st)/2;
            if(letter[med]>target){
                end=med-1;
            }
            else{
                st=med+1;
            }
        }
        //esme hmne element nikalna isliye modulu kiya wrna
        // sidha st return krewate tb pr index print hota then
        return letter[st%letter.length];
        // return letter[st];

    }
    public static void main(String[] args) {
        char[]letter={'a','b','c','j'};
       char target ='i';
      System.out.println(greatvalue(letter,target));
    }
}
