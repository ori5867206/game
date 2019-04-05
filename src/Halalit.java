import javax.swing.*;
import java.util.Random;

public class Halalit {
    private MovHalalit n1;
    private int x;
    private int y;
    private ImageIcon imageIcon;
    private int spid;
    private boolean left=false;
    private boolean down=false;
    Random random = new Random();
    public  Halalit(){

    };
    public Halalit(ImageIcon imageIcon,int x,int y,int spid) {
        this.x = x;
        this.y = y;
        this.spid=spid;
        this.imageIcon = imageIcon;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }


//////////////////////////////////////

    public void movRiget(){
        this.x=this.x+spid;
        if(this.x>Game.WIDTH) {
            this.left = true;
        }
    }

    public void moveLeft() {
        this.x = this.x - spid;
        if (this.x < 0) {
            this.left = false;
        }
    }
    public void mov1() {
        if (left) {
            moveLeft();
        } else {
            movRiget();
        }
    }
    //////////////////////////////////////
    public void movDown(){
        this.y=this.y+spid;
        if(this.y>Game.HEGIT) {
            this.down = false;
        }
    }

    public  void  movUp(){
        this.y=this.y-spid;
        if(this.y<0) {
            this.down = true;
        }
    }
    public void mov2(){

        if (down) {
            movDown();
        } else {
            movUp();
        }



    }
    //////////////////////////////////////
    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }

}
