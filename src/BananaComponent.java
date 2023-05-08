import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BananaComponent extends JComponent {
    ImageIcon icon;
    int x = -190;
    int y = 0;
    boolean goingRight = true;
    boolean goingDown = true;

    public BananaComponent(ImageIcon icon) {

        this.icon = icon;
        System.out.println("Wee");
        Timer timer = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repainting");
                repaint();
            }
        });
        timer.start();
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        if (this.icon != null) {
            graphics.drawImage(icon.getImage(), this.x, this.y, this);

            int imgHeight = this.icon.getImage().getHeight(this);
            int imgWidth = this.icon.getImage().getWidth(this);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            if (this.goingRight && this.x >= screenSize.width - imgWidth)
                this.goingRight = false;
            else if (!this.goingRight && this.x <= 0) {
                this.goingRight = true;
            }
            if (this.goingDown && this.y >= screenSize.height - imgHeight){
                this.goingDown = false;
            } else if (!this.goingDown && this.y <= 0) {
                this.goingDown = true;
            }
            if (this.goingRight){
                this.x++;
            } else{
                this.x--;
            }
            if (this.goingDown){
                this.y++;
            } else{
                this.y--;
            }
            Toolkit.getDefaultToolkit().sync();
        }
    }
}