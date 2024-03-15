import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        super(500, 500, 1); 
        addObject( new  Cliff(true), 85, 441);
        addObject( new  RealityAnchor(), 100, 260);
        addObject( new  RealityAnchor(), 200, 260);
        for(int i = 0; i < 50; i++){
            addObject(new Cloud(), i*10,1);
        }
        addObject( new  Cloud(), 369, 315);
        addObject( new  Spike(0), 320, 315);
        addObject( new  Pengu(), 66, 244);
        addObject(new LevelEnd(Level2.class),400, 250);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
    }
}
