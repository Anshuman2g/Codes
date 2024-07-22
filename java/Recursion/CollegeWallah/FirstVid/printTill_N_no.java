package CollegeWallah.FirstVid;

public class printTill_N_no {
    public static void no(int x){ //
        //base case 
        if(x ==1){
            System.out.println(1);
            return;
        }
        System.out.println(x); //self work
        no(x-1);            //recursive function
    }
    public static void main(String[] args) {
        int n =5;
        no(n);
    }
}
