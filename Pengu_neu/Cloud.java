import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * A cloud that moves back and forth between two defined points.
 */
public class Cloud extends Actor
{
    private int speed = 4;
    public boolean evil = false;
    public Cloud(boolean evil,int speed){
        this.evil = evil;
        this.speed = speed;
    }
    
    List<Class> actorWhitelist = Arrays.asList(Pengu.class);    
    
    /**
     * Move in the direction we are currently moving in. Turn if we reach a turning point.
     */
    public void act()
    {
        if(evil){
            this.setImage("cloud_evil.png");
        }else{
            this.setImage("cloud_wholesome.png");
        }
        setLocation(getX() + speed, getY());
        
        Actor actor = getOneIntersectingObject(null);
        
        if(evil){
            Pengu pengu = (Pengu) this.getOneIntersectingObject(Pengu.class);
            if(pengu != null){
            
            if(pengu.CurrentCheckpoint != null){
            
            pengu.CurrentCheckpoint.teleportBack(pengu);
            
            }else{
                 try {
                    Greenfoot.setWorld(StartScreen.class.newInstance());
                    } catch (InstantiationException | IllegalAccessException e) {
                        System.err.println("Error instantiating next level: " + e.getMessage());
                    }
        }}}else{
            if (actor != null && actorWhitelist.contains(actor.getClass())) {
            actor.setLocation(actor.getX() + speed, actor.getY());
        }
        }
        if (atTurningPoint(actor)) {
            speed =  - speed;
        }
        
    }

    /**
     * Test if we are at one of the turning points.
     */
    public boolean atTurningPoint(Actor actor)
    {
        
        return getOneIntersectingObject(Cliff.class) != null && !actorWhitelist.contains(actor.getClass());
    }
}
