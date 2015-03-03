package fi.riko.neon.objects;

import fi.riko.neon.frameworks.GameObject;
import fi.riko.neon.frameworks.ObjectId;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Bullet extends GameObject {

    public Bullet(float x, float y, ObjectId id, int velX) {
        super(x, y, id);
        this.velX = velX;
    }

    public void tick(LinkedList<GameObject> object) {
        x += velX;
    }

    public void render(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect((int)x, (int)y, 5, 5);
    }

    public Rectangle getBounds() {
        
        return new Rectangle((int)x, (int)y, 5, 5);
    }
    
    
    
}
