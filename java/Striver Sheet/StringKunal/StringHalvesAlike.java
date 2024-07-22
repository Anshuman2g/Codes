public class StringHalvesAlike {
    public static void main(String[] args) {
        boolean flag=false;
       String s = "bootok";
       char[]arr= new char[s.length()];
       int c1=0;
       int c2=0;
       for(int i=0;i<arr.length;i++){
        arr[i] = s.charAt(i);
       }
       for(int i=0;i<arr.length/2;i++){
        if(arr[i] == 'a'||arr[i]== 'e'||arr[i]== 'i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
            c1++;
        }
       }
       for(int j=arr.length/2;j<arr.length;j++){
        if(arr[j] == 'a'||arr[j]== 'e'||arr[j]== 'i'||arr[j]=='o'||arr[j]=='u'||arr[j]=='A'||arr[j]=='E'||arr[j]=='I'||arr[j]=='O'||arr[j]=='U'){
            c2++;
        }
       }
       if(c1==c2) {
    System.out.print("true");
       }
       else{
        System.out.println("false");
       }
             
    }
}
