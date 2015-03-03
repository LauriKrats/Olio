package fi.riko.neon.frameworks;

import fi.riko.neon.objects.Bullet;
import fi.riko.neon.window.Handler;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    
    Handler handler;
    
    public KeyInput(Handler handler) {
        this.handler = handler;
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        for(int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getId() == ObjectId.Player) {
                if(key == KeyEvent.VK_D) tempObject.setVelX(5); // Move right when pressed
                if(key == KeyEvent.VK_A) tempObject.setVelX(-5); // Move left when pressed 

                if(key == KeyEvent.VK_W && !tempObject.isJumping()) { // Jump jump when pressed
                    tempObject.setJumping(true);
                    tempObject.setVelY(-16); // Sets the jumping height
                }
                if(key == KeyEvent.VK_SPACE) {
                    handler.addObject(new Bullet(tempObject.getX(), tempObject.getY() + 30, ObjectId.Bullet, tempObject.getFacing() * 10));
                }
            }
        }
        
        if(key == KeyEvent.VK_ESCAPE) { // Quit program command
            System.exit(1);
        }
    }
    
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        for(int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);
            
            if(tempObject.getId() == ObjectId.Player){
                if(key == KeyEvent.VK_D && tempObject.getVelX() ==5 ){
                    tempObject.setVelX(tempObject.getVelX()-5);
                }else if(key == KeyEvent.VK_A && tempObject.getVelX() == -5)
                    tempObject.setVelX(tempObject.getVelX()+5);

            }
        }
    }
    
}
