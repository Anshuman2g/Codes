package packagStaticD;

public class Singletonn {
    
    // Private constructor to prevent instantiation from outside
    private Singletonn() {
    }
    
    private static Singletonn instance; // Declaration of the private instance variable
    // Static method to access the singleton instance

    public static Singletonn getInstance() {
        if (instance == null) {
            instance = new Singletonn();
        }
        return instance;
    }  
}
