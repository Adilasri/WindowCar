import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener implements KeyListener {

    private MainScene mainScene;

    public MovementListener( MainScene mainScene){
        this.mainScene = mainScene;

    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.mainScene.getCar1().moveRigh();
            this.mainScene.repaint();
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            this.mainScene.getCar1().moveLeft();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("X");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("X");
    }
}
