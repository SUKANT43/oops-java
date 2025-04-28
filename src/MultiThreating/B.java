package MultiThreating;

public class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
            try{
                Thread.sleep(20);
            }
            catch (Exception e){

            }
        }
    }
}
