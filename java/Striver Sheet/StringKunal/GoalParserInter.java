package StringKunal;

public class GoalParserInter {
    public static void main(String[] args) {
        String str ="G()(al)";
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str.length()){
            if(str.charAt(i) == 'G'){
                sb.append('G');
                i++;
            }
            else if(str.charAt(i) == '(' && str.charAt(i+1) ==')'){
                sb.append('o');
                i+=2;
            }
            else{
                sb.append("al");
                i+=4;
            }
        }
      System.out.println(sb.toString());
    }
}
