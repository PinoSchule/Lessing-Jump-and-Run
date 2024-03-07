import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * A cloud that moves back and forth between two defined points.
 */
public class Cloud extends Actor
{
    private int speed = 4;
    private int leftTurn = 270;
    private int rightTurn = 480;
    List<Class> actorWhitelist = Arrays.asList(Pengu.class);
    /**
     * Move in the direction we are currently moving in. Turn if we reach a turning point.
     */
    public void act()
    {
        setLocation(getX() + speed, getY());
        
        Actor actor = getOneIntersectingObject(null);
        if (actor != null && actorWhitelist.contains(actor.getClass())) {
            actor.setLocation(actor.getX() + speed, actor.getY());
        }
        
        if (atTurningPoint()) {
            speed =  - speed;
        }
    }

    /**
     * Test if we are at one of the turning points.
     */
    public boolean atTurningPoint()
    {
        return getX() <= leftTurn || getX() >= rightTurn;
    }
}
