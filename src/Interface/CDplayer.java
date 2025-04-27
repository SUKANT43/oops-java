package Interface;

public class CDplayer implements Media {
    @Override
    public void stop() {
        System.out.println("Music stops");
    }

    @Override
    public void start() {
        System.out.println("Music starts");
    }
}
