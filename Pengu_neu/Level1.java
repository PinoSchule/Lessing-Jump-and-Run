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

        super(650, 650, 1);
        addObject( new  Pengu(), 66, 0);
        int lim = 48;
        for(int i =0; i<=650/lim;i++){
            addObject( new  Cliff(), i*lim, 626);
        }
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
