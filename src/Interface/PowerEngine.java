package Interface;

public class PowerEngine implements Engine{
    public void start(){
        System.out.println("power engine starts");
    }
   public void stop(){
       System.out.println("power engine stops");
   }
   public void acc(){
       System.out.println("power engine acc");
    }
}
