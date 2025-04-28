package MultiThreating;

public class A extends Thread {
    //job is to print to hi
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hi");
        }
    }
}
