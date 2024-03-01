import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
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
        StartSatz startSatz = new StartSatz();
        addObject(startSatz,750,372);
        startSatz.setLocation(750,374);
    }
    
    public void act()
    {
    if(Greenfoot.isKeyDown("enter"))
    {
    Greenfoot.setWorld(new Scene());
    }

    }
}

