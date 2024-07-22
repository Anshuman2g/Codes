package firstVideo;

public class recursiceNumber {
    public static void no(int n){
        if(n == 5){
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        no(n+1);
    }
    public static void main(String[] args) {
        no(1);
    }
}
