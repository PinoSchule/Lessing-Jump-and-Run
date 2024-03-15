import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelWahl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelWahl extends World
{

    /**
     * Constructor for objects of class LevelWahl.
     * 
     */
    public LevelWahl()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 748, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelWahlText levelwahltext = new LevelWahlText();
        addObject(levelwahltext,959,376);
    }
    
    public void act()
    {
    if(Greenfoot.isKeyDown("1"))
    {
    Greenfoot.setWorld(new Level1());
    }
    if(Greenfoot.isKeyDown("2"))
    {
    Greenfoot.setWorld(new Level2());
    }
}
}
