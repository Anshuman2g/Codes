package Kunal.Basics;
 class ans{
    String name;
    int rno;

    ans(String name){
        this.name=name;
        this.rno=rno;
    }
   
 }
public class finalKeyword {
    public static void main(String[] args) {
        final ans a1 = new ans("ram"); //here when we created object with final keyword
        a1.name="shiv";   // we can change the value inside it
                          // but we cant assign it to someone
                             
            a1 = new ans("anss"); 
            // using new we created a another object so we cant now point a1 to some another object as final is used here
             // see here its giving error because we used final keyword for our object
            // we can change the value inside it but cant assign our obj
            // to some another obj 
            // assign means to which ref var it is pointing we cannot change that
            //here it is pointing to ram in heap we cannot change it to anss
    }
}
