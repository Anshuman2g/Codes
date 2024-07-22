package Abstract;

public class son extends parent{
      son(int age){
        super(age); //constructor for calling parent class constructor
      } 
    @Override
     void carrer(String name){
        System.out.println(name);
     }

     @Override
     void partner(String name ,int age){
       System.out.println(name +" "+ "age is"+ age);
     }
     @Override
     void love(){
        System.out.println("i love 3000");
     }
}
