package Interface;

public class NiceCar {
     Engine engine;
     Media media =new CDplayer();
    public NiceCar(){
        engine =new PowerEngine() ;
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public  void  stop(){
        engine.stop();
    }
    public void startMusic(){
        media.start();
    }
    public void stopMusic(){
        media.stop();
    }
}
