package packagStaticD;

public class main {
 
    public static void main(String[] args) {
        human h1 = new human(12,"ram");  //here using human class(file we created separetely)
        human h2 = new human(43,"shiv");
        System.out.println(human.population);
        System.out.println(human.population);
        // we can call the population by using class name as population is a static variable    
       
 
       
    }
}
