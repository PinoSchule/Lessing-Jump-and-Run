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
        Cliff cliff = new Cliff();
        addObject(cliff,78,483);
        cliff.setLocation(71,477);
        Cliff cliff2 = new Cliff();
        addObject(cliff2,126,483);
        cliff2.setLocation(120,478);
        Cliff cliff3 = new Cliff();
        addObject(cliff3,175,482);
        cliff3.setLocation(168,478);
        Cliff cliff4 = new Cliff();
        addObject(cliff4,223,484);
        cliff4.setLocation(216,478);
        cliff4.setLocation(217,479);
        cliff4.setLocation(216,479);
        Cliff cliff5 = new Cliff();
        addObject(cliff5,271,486);
        cliff5.setLocation(265,478);
        cliff5.setLocation(261,477);
        cliff5.setLocation(263,479);
        Cliff cliff6 = new Cliff();
        addObject(cliff6,318,485);
        cliff6.setLocation(311,480);
        Cliff cliff7 = new Cliff();
        addObject(cliff7,366,484);
        cliff7.setLocation(358,479);
        Cliff cliff8 = new Cliff();
        addObject(cliff8,413,485);
        cliff8.setLocation(406,477);
        cliff8.setLocation(406,480);
        Cliff cliff9 = new Cliff();
        addObject(cliff9,461,487);
        cliff9.setLocation(454,482);
        Cliff cliff10 = new Cliff();
        addObject(cliff10,494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(494,488);
        cliff10.setLocation(499,482);
    }
}
