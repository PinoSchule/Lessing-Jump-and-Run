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
        super(624, 624, 1); 
        addObject(new Pengu(), 73, 553);
        addObject(new house(), 30, 555);
        int lim = 48;
        for(int i =0; i<=624/lim;i++){
            addObject( new  Cliff(), i*lim, 600);
        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Spike spike = new Spike(0);
        addObject(spike,182,561);
        spike.setLocation(143,553);
        Spike spike2 = new Spike(0);
        addObject(spike2,197,561);
        spike2.setLocation(191,553);
        RealityAnchor realityanchor = new RealityAnchor();
        addObject(realityanchor,73,553);

        realityanchor.setLocation(59,544);
        RealityAnchor realityanchor2 = new RealityAnchor();
        addObject(realityanchor2,531,553);
        realityanchor2.setLocation(481,543);
        Cliff cliff = new Cliff();
        addObject(cliff,536,557);
        cliff.setLocation(529,553);
        realityanchor2.setLocation(530,497);
        Cliff cliff2 = new Cliff();
        addObject(cliff2,446,444);
        Cloud cloud = new Cloud(false,4);
        addObject(cloud,313,407);
        cloud.setLocation(306,388);
        cloud.setLocation(328,388);
        cloud.setLocation(363,404);
        cloud.setLocation(370,403);
        cliff2.setLocation(454,427);
        cloud.setLocation(375,391);
        Cliff cliff3 = new Cliff();
        addObject(cliff3,30,371);
        Cliff cliff4 = new Cliff();
        addObject(cliff4,83,378);
        cliff4.setLocation(78,373);
        cliff4.setLocation(77,371);
        cliff4.setLocation(78,372);
        cliff3.setLocation(172,373);
        cliff2.setLocation(461,403);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(78,372);
        cliff4.setLocation(6,352);
        cliff3.setLocation(72,389);
        cliff3.setLocation(66,389);
        cliff3.setLocation(57,391);
        removeObject(cliff4);
        Spike spike4 = new Spike(0);
        addObject(spike4,276,357);
        removeObject(spike4);
        Cliff cliff5 = new Cliff();
        addObject(cliff5,63,244);
        cliff5.setLocation(50,220);
        LevelEnd levelend = new LevelEnd(Level2.class);
        addObject(levelend,59,177);
        levelend.setLocation(52,177);
        cliff5.setLocation(50,222);

        cliff2.setLocation(471,469);
        cloud.setLocation(370,419);
        cliff5.setLocation(73,338);

        cliff5.setLocation(173,286);
        removeObject(cliff5);

        cliff3.setLocation(59,376);

        cliff2.setLocation(468,420);
        cliff2.setLocation(460,442);
        levelend.setLocation(55,348);
    }
}
