package CollectionsFramwork.enums;

public class basic implements A{
     enum week{
         Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
         //these are enum constants
         //public static and final
         // since its final we cant create child enum
         //type is week
         week(){
            System.out.println("calling the construcotr when declaring the one"+this);
         } // accesesd only one(sunday) in main functino but constructor ran for all 7 variables
         // because enum construcotor are not public or  protected they are mainly private or default
         // because enum constant can only be intialized once cant change the constant value
     }
     
     @Override
      public void fun(){
        System.out.println("enum can implement multiple interfaces");
     }
     public static void main(String[] args) {
        week wk; //declaring a variable
        wk = week.Sunday;    //assiging the varibale value
        System.out.println(wk);
       System.out.println(wk.ordinal());// position of enum declaration
      
       basic obj = new basic();
       obj.fun();  // calling a interfce method inside enums
     }
   
}
