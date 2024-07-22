package Xprac;
import java.util.*;
public class Baseball {
    public static void main(String[] args) {
     String[]s={"5","2","C","D","+"};
    int[]arr=new int[s.length];
    int idx=0;
    for(int i=0;i<s.length;i++){
        if(s[i].equals("C")){
            arr[idx-1]=0;
            idx--;
        }
        else if(s[i].equals("D")){
            arr[idx]=arr[idx-1]*2;
            idx++;
        }
        else if(s[i].equals("+")){
            arr[i]=arr[idx-1]+arr[idx-2];
            idx++;
        }
        else {
            arr[idx]= Integer.parseInt(s[i]);
            idx++;
        }
    }
    int cn=0;
    for(int i=0;i<arr.length;i++){
        cn+=arr[i];
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
     System.out.println(   cn);
    }
}
