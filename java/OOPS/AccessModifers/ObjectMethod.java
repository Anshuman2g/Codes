package AccessModifers;

public class ObjectMethod {
    int n;
    ObjectMethod(int n){
    this.n=n;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public boolean equals(Object obj){
        return this.n == ((ObjectMethod)obj).n;
    }
    public static void main(String[] args) {
        ObjectMethod obj = new ObjectMethod(33);
        System.out.println(obj.hashCode()); // hashcode of this object

        ObjectMethod obj2 = new ObjectMethod(33); //here differnet value of second onject
        System.out.println(obj2.hashCode());

        if (obj.equals(obj2)){
            System.out.println("its equal");
        }
    }
        
}
