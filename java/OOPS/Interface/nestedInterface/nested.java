package Interface.nestedInterface;

public class nested {
    public interface nestedInterface{
        boolean isOdd(int num);
    } // nested interface a interface inside a class 
}

class B implements nested.nestedInterface{
    public boolean isOdd(int num){
        return (num) == 1;       // implement using calss name then interface name
    }
}


