package Abstract2;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("I am a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + ". She is " + age);
    }
}
