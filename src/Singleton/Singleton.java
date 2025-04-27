package Singleton;

public class Singleton {
    private int n=0;
    private Singleton(){
        System.out.println("Single ton is created");
    }
    private static Singleton instance;
   static public Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }else{
            System.out.println("already there is one object");
        }
        return instance;
    }
}
