import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * The class Mover provides some basic movement methods. Use this as a superclass 
 * for other actors that should be able to move left and right, jump up and fall down.
 */
public class Mover extends Actor
{
    /* Gravity (acceleration downwards)*/
    private static final int acceleration = 2;
    /* Running speed (sidewards)*/
    private static final int speed = 9;
    /* Current vertical speed*/
    private int vSpeed = 0;

    /**
     * 
     */
    public void moveRight()
    {
        setLocation(getX() + speed, getY()-10);
        boolean okToMove = getIntersectingObjects(null).isEmpty();
        if (!okToMove)
        {
            setLocation(getX() - speed, getY());
        }
        setLocation(getX(), getY()+10);
    }

    /**
     * 
     */
    public void moveLeft()
    {
        setLocation(getX() - speed, getY()-10);
        boolean okToMove = getIntersectingObjects(null).isEmpty();
        if (!okToMove)
        {
            setLocation(getX() + speed, getY());
        }
        setLocation(getX(), getY()+10);
    }

    /**
     * 
     */
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2 + 5, null);
        Object above = getOneObjectAtOffset(0, 0, null);
        boolean onGround = (under != null & above == null);
        return onGround;
    }

    /**
     * 
     */
    public void setVSpeed(int speed)
    {
        vSpeed = speed;
    }

    /**
     * 
     */
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if (atBottom()) {
            gameEnd();
        }
    }

    /**
     * 
     */
    public boolean atBottom()
    {
        return getY() >= getWorld().getHeight() - 2;
    }

    /**
     * 
     */
    public void gameEnd()
    {
        Greenfoot.stop();
    }
}
