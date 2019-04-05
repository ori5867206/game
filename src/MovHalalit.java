import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovHalalit implements KeyListener {

private Halalit o;
    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {

             if (e.getKeyCode()==KeyEvent.VK_R);
        //     o.movRiget();
          //  JOptionPane.showMessageDialog(null, "hellooooo");

    }

    @Override
    public void keyReleased(KeyEvent e) {

      }
}
