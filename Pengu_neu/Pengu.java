import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * A little penguin that wants to get to the other side.
 */
public class Pengu extends Mover
{
    public static final int jumpStrength = 25;
    private int lebenspunkte = 3;
    public boolean dead = false;
    public boolean lost = false;
    public RealityAnchor CurrentCheckpoint;
    /**
     * Check keyboard input and react accordingly.
     */
    public void act()
    {
        checkKeys();
        checkFall();
        checkLife();
    }
 
    /**
     * 
     */
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")) {
            setImage("Mario-left.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right")) {
            setImage("Mario-right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("space")) {
            if (onGround()) {
                jump();
            }
        }
    }

    /**
     * Start a jump action.
     */
    private void jump()
    {
        setVSpeed( - jumpStrength);
        fall();
        checkFall();
    }

    /**
     * Check whether we are falling. If so, fall. 
     * If we're on ground, stop the fall.
     */
    private void checkFall()
    {
        if (inFreeFall() && !smthAbove()) {
            fall();
        }
        else if (inFreeFall() && smthAbove()) {
            setLocation(getX(), getY() + mod(vSpeed));
            setVSpeed(-vSpeed-3);
            fall();
        }
        else {
            setVSpeed(0);
        }
    }
    
    private void checkLife()
    {
        if (dead)
        {
            lebenspunkte --;
            dead = false;
        }
        if (lebenspunkte <= 0)
        {
            lost = true;
        }
        if (lost)
        {
            gameEnd();
        }
    }
}
