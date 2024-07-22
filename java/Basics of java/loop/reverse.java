public class reverse{
    public static void main(String[] args) {
        int n=12345;
        int ans=0;
        while(n>0){
            int rem=n%10;     //yhn mreko remainder milega jaise 5
            n =n/10;                     //yhn mreko quotient milega jaise 12345

            ans =ans*10+rem;
        }
        System.out.println(ans);
    }
}