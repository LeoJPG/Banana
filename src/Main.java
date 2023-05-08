import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        BananaFrame frame = new BananaFrame();
        frame.setType(Window.Type.UTILITY);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
    }
}

