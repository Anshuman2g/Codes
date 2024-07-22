public class DecryptStringAlptoInt {
    public static void main(String[] args) {
       String s = "10#11#12";
       int i=0;
       int j=s.length();
       StringBuilder sb = new StringBuilder();
       while(i<j){
        if((i+2)<j && s.charAt(i+2) == '#'){
            String st = s.substring(i,i+2);
            int ix= Integer.parseInt(st);
          
            sb.append((char)(ix+96));
            i+=3;
        } 
        else{
            char ch = s.charAt(i);
            sb.append((char)(ch+48));
            i++;
        }
       }
       System.out.println(sb.toString());
    }
}
