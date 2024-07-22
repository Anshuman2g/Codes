package CollegeWallah.FirstVid;

public class basic{
    public static void no(int x){
            if(x ==1 ){
                System.out.println(1);
                return;
            }
            no(x-1);
            System.out.println(x);
    } 
    public static void main(String[] args) {
        int x=5;
        no(x);
    }
}