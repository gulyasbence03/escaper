package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

// This stores variables that will be used in player and npc classes.
public class Entity {
    public int x,y;
    public int speed;

    // Variables for sprites
    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction;
    public int spriteCounter = 0;
    public int spriteNum = 1;

    // Collision/hitbox with direction
    public Rectangle solidArea;
    public boolean collisionOnUp = false;
    public boolean collisionOnDown = false;
    public boolean collisionOnLeft = false;
    public boolean collisionOnRight = false;

    public  int solidAreaDefaultX, solidAreaDefaultY;
}
