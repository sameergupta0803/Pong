import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

    GamePanel panel;

    ImageIcon icon = new ImageIcon(getClass().getResource("ponggame.png"));
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setIconImage(icon.getImage());
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}