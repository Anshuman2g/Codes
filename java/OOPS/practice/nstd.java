package practice;

public class nstd {
    static class fn{
        String name;
       public fn(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        fn obj = new fn("ram");
        fn obj2 = new fn("shiv");
        System.out.println(obj.name + " "+ obj2.name);
         
    }
}
