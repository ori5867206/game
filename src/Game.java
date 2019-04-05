import javax.swing.*;
import java.awt.*;

public class Game extends JFrame{
    public static final int   WIDTH=1000;// מתודות סטטיות שנוכל להשתמש מכל מקום
    public static final int HEGIT=500;
    private static ImageIcon oiev;


public Game(){
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//פקודה לסגירת החלון על ידי האיקס
    this.setPreferredSize(new Dimension(WIDTH,HEGIT));
    this.getContentPane().add(new GamePanel());
    this.pack();

}

    public static void main(String[] args) {
        Game g1=new Game();
      //  g1.addKeyListener(new MovHalalit());
    }
}

