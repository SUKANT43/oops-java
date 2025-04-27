package Interface;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.start();
//        car.acc();
//        car.stop();
        Engine engine = new ElectricEngine();

        NiceCar c2=new NiceCar();
        c2.start();
    NiceCar c3=new NiceCar(engine);
        c3.start();
}
}
