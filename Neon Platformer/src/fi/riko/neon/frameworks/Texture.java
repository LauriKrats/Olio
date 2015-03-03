package fi.riko.neon.frameworks;

import fi.riko.neon.window.BufferedImageLoader;
import java.awt.image.BufferedImage;

public class Texture {
    
    SpriteSheet bs, ps;
    private BufferedImage player_sheet = null;
    private BufferedImage block_sheet = null;
    
    public BufferedImage[] player = new BufferedImage[14];
    public BufferedImage[] block = new BufferedImage[8];
    
    public BufferedImage[] water = new BufferedImage[4];
    // Hyppyanimaatio tulevaisuutta varten!
    // public BufferedImage[] player_jump = new BufferedImage[6]; 
    
    public Texture() {
        
        
        BufferedImageLoader loader = new BufferedImageLoader();
        try {
            block_sheet = loader.loadImage("/blocks.png");
            player_sheet = loader.loadImage("/player.png");
        } catch(Exception e) {
            e.printStackTrace();
        }
        ps = new SpriteSheet(player_sheet);
        bs = new SpriteSheet(block_sheet);
        
        
        getTextures();
    }
    
    // Grabbing photos from stripes
    private void getTextures(){
         
        water[0] = bs.grabImage(2, 4, 32, 32); // Top plain water block
        water[1] = bs.grabImage(2, 5, 32, 32); // Bottom plain water block
        water[2] = bs.grabImage(3, 4, 32, 32); // Top block water block (?:D)
        water[3] = bs.grabImage(3, 5, 32, 32); // Bottom block water block
        
        block[0] = bs.grabImage(6, 1, 32, 32); // Dirt block
        block[1] = bs.grabImage(3, 3, 32, 32); // Grass block
        block[2] = bs.grabImage(5, 1, 32, 32); // Dirt block with spine
        block[3] = bs.grabImage(4, 3, 32, 32); // Grass block with spine
        block[4] = bs.grabImage(12, 3, 32, 32); // Statue top part 1/2
        block[5] = bs.grabImage(13, 3, 32, 32); // Statue top part 2/2
        block[6] = bs.grabImage(14, 3, 32, 32); // Statue bottom part 1/2
        block[7] = bs.grabImage(15, 3, 32, 32); // Statue bottom part 2/2
        
        // Looking Right
        player[0] = ps.grabImage(1, 2, 31, 53); // Idle frame for player
        player[1] = ps.grabImage(2, 2, 31, 53); // Walking animation for player
        player[2] = ps.grabImage(3, 2, 31, 53); // -- || --
        player[3] = ps.grabImage(4, 2, 31, 53);
        player[4] = ps.grabImage(5, 2, 31, 53);
        player[5] = ps.grabImage(6, 2, 31, 53);
        player[6] = ps.grabImage(7, 2, 31, 53);
        
        // Looking left
        player[7] = ps.grabImage(1, 1, 31, 53); // Idle frame for player
        player[8] = ps.grabImage(2, 1, 31, 53); // Walking animation for player
        player[9] = ps.grabImage(3, 1, 31, 53); // -- || --
        player[10] = ps.grabImage(4, 1, 31, 53);
        player[11] = ps.grabImage(5, 1, 31, 53);
        player[12] = ps.grabImage(6, 1, 31, 53);
        player[13] = ps.grabImage(7, 1, 31, 53);
    
        // Jumping animation - EI SPRITEÄ !
        // player_jump[0] = ps.grabImage(col, row, width, heigth);
        // player_jump[1] = ps.grabImage(col, row, width, heigth);
        // player_jump[2] = ps.grabImage(col, row, width, heigth);
        // player_jump[3] = ps.grabImage(col, row, width, heigth);
        // player_jump[4] = ps.grabImage(col, row, width, heigth);
        // player_jump[5] = ps.grabImage(col, row, width, heigth);
    }
    
}
