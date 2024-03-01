import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

public class LevelEnd extends Actor {
    public Class<? extends World> targetLevel;

    public LevelEnd(Class<? extends World> targetLevel) {
                setImage("space.jpg");
                this.targetLevel = targetLevel;
    }

    public void act() {
        
        Pengu pengu = (Pengu) this.getOneIntersectingObject(Pengu.class);

        if (pengu != null && this.isActive()) {
                try {
                    World nextWorld = targetLevel.newInstance(); 
                    Greenfoot.setWorld(nextWorld);
                } catch (InstantiationException | IllegalAccessException e) {
                    System.err.println("Error instantiating next level: " + e.getMessage());
                }
        }
    }

    public boolean isActive() {
        return true;
    }
}