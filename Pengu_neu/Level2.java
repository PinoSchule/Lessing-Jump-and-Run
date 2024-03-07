import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        addObject( new  Pengu(), 66, 0);
        int lim = 10;
        for(int i =0; i<lim;i++){
    addObject( new  Spike(1), i*(500/lim), 470);
    }
    }
    public Object getNextLevel(){
        return new Level1();
    }
}
