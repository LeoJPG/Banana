import javax.swing.*;
import java.awt.*;

class BananaFrame extends JDialog {
    Container container;
    BananaComponent bananaComponent;

    public BananaFrame(){
        container = getContentPane();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setUndecorated(true);
        setBackground(new Color(0,0,0,0));
        java.net.URL img_url = getClass().getResource("banana.png");
        bananaComponent = new BananaComponent(new ImageIcon(img_url));
        bananaComponent.setBackground(new Color(0,0,0,0));
        container.add(bananaComponent);
    }
}