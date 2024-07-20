import java.awt.*;

public class Car {
    public static final int BODY_WIDTH = 100;
    public static final int BODY_HEIGH = 80;
    private int x;
    public int y;
    private boolean visible;
    public Car (int x, int y){
        this.x = x;
        this.y =y;
        this.visible = true;
    }
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(this.x
                ,this.y
                , BODY_WIDTH
                , BODY_HEIGH );

        g.setColor(Color.BLUE);
        g.fillRect(this.x + BODY_WIDTH,
                (this.y + BODY_HEIGH / 2),
                BODY_WIDTH/2,
                BODY_HEIGH/2);

        g.setColor(Color.red);
        g.fillOval(this.x,
                this.y + BODY_HEIGH - BODY_WIDTH / 4 / 2,
                BODY_WIDTH / 4,
                BODY_WIDTH / 4);

        g.fillOval(this.x + BODY_WIDTH,
                this.y + BODY_HEIGH - BODY_WIDTH / 4 / 2,
                BODY_WIDTH / 4,
                BODY_WIDTH / 4);

    }


    public void moveRigh(){
        this.x++;
    }

    public void moveLeft(){
        this.x -= 5;
    }



}
