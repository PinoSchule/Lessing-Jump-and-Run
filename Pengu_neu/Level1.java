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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
                addObject( new  Cliff(true), 665, 441);
        addObject( new  Cliff(true), 85, 441);
        for(int i = 0; i < 50; i++){
            addObject(new Cloud(), i*10,1);
        }
        addObject( new  Cloud(), 369, 315);
        addObject( new  Pengu(), 66, 244);
        addObject(new LevelEnd(),400, 250);
        
    }
    public Object getNextLevel(){
        return new Level2();
    }
}
