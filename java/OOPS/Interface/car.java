package Interface;

import Interface.defaultInterface.deafault;

public class car implements Engine,brake,media,deafault{
    
    @Override
    public void brake(){
        System.out.println("the brake is applied here");
    }
    @Override
    public void st(){
        System.out.println("start engine like a normal car");
    }
    @Override
    public void stop(){
        System.out.println("stop engine like a normal car");
    }
    @Override
   public void acc(){
        System.out.println("car accelerated");
    }

   
    //in this class we are inherting more than one parent class 
    // it is only possible because of interface as it allows to inherit more than one class
}
