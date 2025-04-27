package Static;

public class Main {

    public static void main(String[] args) {
        Human h1=new Human(1,"sdsd",1232223,true);
        Human h2=new Human(1,"sdsd",1232223,true);
        System.out.println(h2.population);//this is a static
        System.out.println(Human.population);

    }
}
