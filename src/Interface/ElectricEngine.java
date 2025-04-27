package Interface;

public class ElectricEngine implements Engine {
    public void start(){
        System.out.println("ElectricEngine starts");
    }
    public void stop(){
        System.out.println("ElectricEngine stops");
    }
    public void acc(){
        System.out.println("ElectricEngine acc");
    }
}

