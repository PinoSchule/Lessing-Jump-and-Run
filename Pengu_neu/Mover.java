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
    private static final int acceleration = 3;
    /* Running speed (sidewards)*/
    private static final int speed = 5;
    /* Current vertical speed*/
    public static int vSpeed = 0;
    List<Class> actorBlacklist = Arrays.asList(RealityAnchor.class);
    /**
     * 
     */
    public void moveRight()
    {
        setLocation(getX() + speed, getY() - 30);
        List allIntersects = getIntersectingObjects(Actor.class);
        List anchorIntersects = getIntersectingObjects(RealityAnchor.class);
        boolean okToMove = (allIntersects.size() == anchorIntersects.size());
        setLocation(getX(), getY() + 30);
        if (!okToMove)
        {
            setLocation(getX() + speed, getY());
        }
    }

    /**
     * 
     */
    public void moveLeft()
    {
        setLocation(getX() - speed, getY() - 30);
        List allIntersects = getIntersectingObjects(Actor.class);
        List anchorIntersects = getIntersectingObjects(RealityAnchor.class);
        boolean okToMove = (allIntersects.size() == anchorIntersects.size());
        setLocation(getX(), getY() + 30);
        if (!okToMove)
        {
            setLocation(getX() + speed, getY());
        }
    }
    
    /**
     * 
     */
    public boolean inFreeFall()
    {
        setLocation(getX(), getY());
        boolean aboveGround = (getIntersectingObjects(Actor.class).size() == getIntersectingObjects(RealityAnchor.class).size());
        setLocation(getX(), getY());
        return aboveGround;
    }
    
    /**
     * 
     */
    public boolean smthAbove()
    {
        setLocation(getX(), getY() - mod(vSpeed));
        boolean aboveGround = (getIntersectingObjects(Actor.class).size() != getIntersectingObjects(RealityAnchor.class).size());
        setLocation(getX(), getY() + mod(vSpeed));
        return aboveGround;
    }

    
    /**
     * 
     */
    public boolean onGround()
    {
        setLocation(getX(), getY() + 20);
        boolean smthBeneath = (getIntersectingObjects(Actor.class).size() != getIntersectingObjects(RealityAnchor.class).size());
        setLocation(getX(), getY() - 20);
        return smthBeneath;
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
    public int mod(int x)
    {
        if (x < 0) {
            return -x;
        }
        else {return x;}
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
