import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * A little penguin that wants to get to the other side.
 */
public class Pengu extends Mover
{
<<<<<<< Updated upstream

    public static final int jumpStrength = 29;
=======
    public static final int jumpStrength = 25;
>>>>>>> Stashed changes

   

    public RealityAnchor CurrentCheckpoint;
    /**
     * Check keyboard input and react accordingly.
     */
    public void act()
    {
        checkKeys();
        checkFall();
       
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
<<<<<<< Updated upstream
            setVSpeed(-vSpeed-1);
=======
            setVSpeed(-vSpeed-2);
>>>>>>> Stashed changes
            fall();
        }
        else {
            setVSpeed(0);
        }
    }
}
