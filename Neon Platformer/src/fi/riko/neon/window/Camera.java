package fi.riko.neon.window;

import fi.riko.neon.frameworks.GameObject;


public class Camera {
    
    private float x, y;
    
    public Camera(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void tick(GameObject player) {
        x = -player.getX() + Game.WIDTH/2 -200; // Camera sticks with the player
        // x--; etc. if you want the camera to move automaticly
        
        // Disable this if you want the camera to follow only at X axis
        y = -player.getY() + Game.HEIGHT/2 +50;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
}
