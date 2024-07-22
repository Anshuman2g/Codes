package Interface;

public class nicecar {
    // private Engine engine; 
    // or
    private Engine engine = new powerEngine();

    public nicecar(Engine engine){
        this.engine=engine;
    }

    public void st(){
        engine.st();
    }
}
