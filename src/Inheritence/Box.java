public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //cube
    Box(double side){
        this.w=side;
        this.h=side;
        this.l=side;
    }

    //cube
    Box(double l,double h,double w){
        this.w=l;
        this.h=h;
        this.l=w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
