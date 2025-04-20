package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("sukant");
        s1.setAge(21);
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
    }
}
