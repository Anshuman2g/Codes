package AccessModifers;

public class A {
   protected int n;
    String name;
    int[]arr;
    public A(int n,String name){
        this.n=n;
        this.name=name;
        this.arr=new int[n];
    }
    public int getn(){
        return n;
    }
    public void setn(int n){
        this.n=n;
    }
    public static void main(String[] args) {
        A o1 = new A(33, null);
        System.out.println(o1.n);
    }
}
