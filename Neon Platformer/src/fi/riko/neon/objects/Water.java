package fi.riko.neon.objects;

import fi.riko.neon.frameworks.GameObject;
import fi.riko.neon.frameworks.ObjectId;
import fi.riko.neon.frameworks.Texture;
import fi.riko.neon.window.Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Water extends GameObject{
    
    Texture tex = Game.getInstance();
    private int type;

    public Water(float x, float y, int type, ObjectId id) {
        super(x, y, id);
        this.type = type;
    }

    public void tick(LinkedList<GameObject> object) {
        
    }

    public void render(Graphics g) {
        if(type == 0) // Dirt block
            g.drawImage(tex.water[0], (int)x,(int)y, null);
        if(type == 1) // Grass block
            g.drawImage(tex.water[1], (int)x,(int)y, null);
        if(type == 2) // Dirt block with spine
            g.drawImage(tex.water[2], (int)x, (int)y, null);
        if(type == 3)
            g.drawImage(tex.water[3], (int)x, (int)y, null);
    }
    
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 32, 32);
    }
}