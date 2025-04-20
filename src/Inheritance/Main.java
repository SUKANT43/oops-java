package Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("box1 and box2");
        Box box1 = new Box(4, 3, 2);
        Box box2 = new Box(box1);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        box2.information();

        System.out.println("box3");
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h + " " + box3.weight);

        System.out.println("box4");
        BoxWeight box4 = new BoxWeight(1,2,3,4);
        System.out.println(box4.l + " " + box4.w + " " + box4.h+" "+box4.weight);

        System.out.println("box5");
        Box box5=new BoxWeight(2,3,4,8);
        System.out.println(box5.w);

        System.out.println("box6 ");
//        BoxWeight box6=new Box(1,2,3);

        System.out.println("Box7");
            BoxPrice box7=new BoxPrice(1,2,3,4,5);
        System.out.println(box7.l+" "+box7.h+" "+box7.w+" "+box7.weight+" "+box7.cost);
    }
}
