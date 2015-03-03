package fi.riko.neon.objects;

import fi.riko.neon.frameworks.GameObject;
import fi.riko.neon.frameworks.ObjectId;
import fi.riko.neon.frameworks.Texture;
import fi.riko.neon.window.Game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Block extends GameObject{
    
    Texture tex = Game.getInstance();
    private int type;

    public Block(float x, float y, int type, ObjectId id) {
        super(x, y, id);
        this.type = type;
    }

    public void tick(LinkedList<GameObject> object) {
        
    }

    public void render(Graphics g) {
        if(type == 0) // Dirt block
            g.drawImage(tex.block[0], (int)x,(int)y, null);
        if(type == 1) // Grass block
            g.drawImage(tex.block[1], (int)x,(int)y, null);
        if(type == 2) // Dirt block with spine
            g.drawImage(tex.block[2], (int)x, (int)y, null);
        if(type == 3) // Grass block with spine
            g.drawImage(tex.block[3], (int)x, (int)y, null);
        if(type == 4) // Statue top part 1/2
            g.drawImage(tex.block[4], (int)x, (int)y, null);
        if(type == 5) // Statue top part 2/2
            g.drawImage(tex.block[5], (int)x, (int)y, null);
        if(type == 6) // Statue bottom part 1/2
            g.drawImage(tex.block[6], (int)x, (int)y, null);
        if(type == 7) // Statue bottom part 2/2
            g.drawImage(tex.block[7], (int)x, (int)y, null);
    }
    
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 32, 32);
    }
}