import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    Levelpipe pipe1 = new Levelpipe();
    Levelpipe pipe2 = new Levelpipe();
    Pengu pengu1 = new Pengu(); 
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 650, 1); 
        addObject( new  Pengu(), 66, 0);
        int lim = 48;
        for(int i =0; i<=650/lim;i++){
            addObject( new  Cliff(), i*lim, 626);
    }
    }
    public Object getNextLevel(){
        return new Level1();
    }
}
