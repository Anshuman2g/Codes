package Kunal.Basics;
class human{
    String name;
    int ht;
    int age;
    human(){
        this("mar",5,19);      //calling constructor inside constructor
    }
    human(String name,int ht,int age){
     this.name=name;
     this.ht=ht;
     this.age=age;
    }
}
public class callConsFromCons {
    public static void main(String[] args) {
        human h1 = new human("ram",6,23);
        // System.out.println(h1.name);
        // System.out.println(h1.ht);
        // System.out.println(h1.age);
        human h2 = new human();
        System.out.println(h2.name);
    
    }
}
