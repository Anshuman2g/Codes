package Kunal.Basics;
class run{
    String name;
    int rank;
    run(String name){
        this.name=name;
    }
    //finalizer(garabage collector)
    // when any obj of this class(run) is free from memory this finalize would be called

    public void finalize() throws Throwable{
        System.out.println("funn");
    }
}
public class finalizer {
    public static void main(String[] args) {
        run r1 = new run("raf");
        for(int i=0;i<100000000;i++){
            r1= new run("destory");
        } 
        
        // here we are assigning object to ref variable till 10000000000
        // so all other object would be free and when they would get removed
        // fnalized is used to do certain actions so we told to sout  that and it would execute that
    }
}
