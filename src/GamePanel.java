import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GamePanel extends JPanel {
    private final int RO = 10;
    private final int DI = 100;
    Random random = new Random();

    private ImageIcon beckGraund;
    private ImageIcon boom;
    private List<Halalit> halalitOiev;//רשימה של אובייקטים

    private List<Halalit> halalitGood;
    ;

    public GamePanel() {
        beckGraund = new ImageIcon(getClass().getResource("kvatzim/a3.jpg"));
        boom = new ImageIcon(getClass().getResource("kvatzim/boom.gif"));
        //.....................................................................................
        //ImageIcon imageIcon1=new ImageIcon(getClass().getResource("kvatzim/g.gif"));
        //Halalit halalit=new Halalit(imageIcon1,new Random().nextInt(78),new Random().nextInt(77),6);
        //    int ;

        halalitGood = new ArrayList<>();
        for (int i = 0; i < RO; i++) {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("kvatzim/g.gif"));
            Halalit halalit1 = new Halalit(imageIcon, Game.WIDTH / 2, 380, 5);
            halalitGood.add(halalit1);
        }


        halalitOiev = new ArrayList<>();
        for (int i = 0; i < RO; i++) {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource("kvatzim/g2.gif"));
            Halalit h1 = new Halalit(imageIcon, new Random().nextInt(1000), new Random().nextInt(200), 5);
            halalitOiev.add(h1);
        }
        new Thread(() -> {
            while (true) {
                for (Halalit h3 : this.halalitOiev) {
                    h3.mov2();
                    h3.mov1();
                }
                try {
                    Thread.sleep(22);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();//עד כאן התהליך

        new Thread(() -> {
            while (true) {
                for (Halalit h4 : this.halalitGood) {
                  //  h4.mov1();

                }
                try {
                    Thread.sleep(56);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //MovHalalit movHalalit=new MovHalalit();
        //  this.addKeyListener(movHalalit);
    }


    @Override
    protected void paintComponent(Graphics page) {

        super.paintComponent(page);
        beckGraund.paintIcon(this, page, 0, 0);


        //halalitGood.paintIcon(this, page, Game.WIDTH/2,380);

        for (int i = 0; i < 1; i++) {
            Halalit h5 = this.halalitGood.get(i);
            h5.getImageIcon().paintIcon(this, page, h5.getX(), h5.getY());
        }


        for (int i = 0; i < this.halalitOiev.size(); i++) {
            Halalit h2 = this.halalitOiev.get(i);
            h2.getImageIcon().paintIcon(this, page, h2.getX(), h2.getY());
        }
        if (halalitGood == halalitOiev) {
            boom.paintIcon(this, page, 86, 3);
        }
    }
    //public void boom(){


    //

}