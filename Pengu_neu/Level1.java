import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    Levelpipe pipe1 = new Levelpipe();
    Levelpipe pipe2 = new Levelpipe();
    Pengu pengu1 = new Pengu(); 
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
        addObject(new LevelEnd(Level2.class),400, 250);
        addObject( pengu1, 6, 244);
        addObject(pipe1, 125, 235);
        addObject( pipe2, 625, 235);

        prepare();
    }
    public void act()
   {
    pengu1.checkPipe();


   }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
    }
}
