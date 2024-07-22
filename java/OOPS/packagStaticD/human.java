package packagStaticD;

public class human {
    int age;
    String name;
    static long population;
    
    human(int age,String name){
     this.age=age;
     this.name=name;
     human.population+=1;
    }
}
