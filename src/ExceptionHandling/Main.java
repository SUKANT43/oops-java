package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            int v = a / b;
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }

    }
}
