import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

public class LevelEnd extends Actor {
    private static HashMap<Class<? extends World>, Class<? extends World>> levelMap = new HashMap<>();

    static {
        //Hier die Levels hinpacken, levelMap.put(erstesLevel.class,dassfolgendeLevel.class)         also von welchen level zu welchen.  
        levelMap.put(Level1.class, Level2.class);

    }

    public LevelEnd() {
    }

    public void act() {
        Actor actor = this.getOneIntersectingObject((Class)null);
        if (actor != null && this.isActive()) {
            Class<? extends World> nextLevelClass = levelMap.get(this.getWorld().getClass());
            if (nextLevelClass != null) {
                try {
                    World nextWorld = nextLevelClass.newInstance(); 
                    Greenfoot.setWorld(nextWorld);
                } catch (InstantiationException | IllegalAccessException e) {
                    System.err.println("Error instantiating next level: " + e.getMessage());
                }
            }
        }
    }

    public boolean isActive() {
        return true;
    }
}