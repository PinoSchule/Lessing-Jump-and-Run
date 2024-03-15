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
        super(650, 650, 1); 
        addObject( new  Pengu(), 66, 0);
        int lim = 48;
        for(int i =0; i<=650/lim;i++){
            addObject( new  Cliff(), i*lim, 626);
        }
        prepare();
    }

    public Object getNextLevel(){
        return new Level1();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cliff cliff = new Cliff();
        addObject(cliff,622,534);
        cliff.setLocation(618,532);
        Cliff cliff2 = new Cliff();
        addObject(cliff2,577,538);
        cliff2.setLocation(572,531);
        Cliff cliff3 = new Cliff();
        addObject(cliff3,530,538);
        cliff3.setLocation(526,532);
        Cliff cliff4 = new Cliff();
        addObject(cliff4,485,536);
        cliff4.setLocation(478,532);
        Cliff cliff5 = new Cliff();
        addObject(cliff5,375,473);
        cliff5.setLocation(375,471);
        Cliff cliff6 = new Cliff();
        addObject(cliff6,332,474);
        cliff6.setLocation(327,470);
        cliff6.setLocation(327,472);
        Cliff cliff7 = new Cliff();
        addObject(cliff7,285,474);
        cliff7.setLocation(278,469);
        cliff6.setLocation(328,470);
        cliff7.setLocation(279,470);
        Cliff cliff8 = new Cliff();
        addObject(cliff8,237,477);
        cliff8.setLocation(232,470);
        Cliff cliff9 = new Cliff();
        addObject(cliff9,77,374);
        cliff9.setLocation(73,368);
        Cliff cliff10 = new Cliff();
        addObject(cliff10,126,375);
        cliff10.setLocation(121,368);
        Cliff cliff11 = new Cliff();
        addObject(cliff11,176,374);
        cliff11.setLocation(169,369);
        Cliff cliff12 = new Cliff();
        addObject(cliff12,224,374);
        cliff12.setLocation(216,367);
        cliff12.setLocation(214,368);
        cliff12.setLocation(217,370);
        Cliff cliff13 = new Cliff();
        addObject(cliff13,324,315);
        cliff13.setLocation(314,307);
        Cliff cliff14 = new Cliff();
        addObject(cliff14,472,246);
        cliff14.setLocation(464,240);
        Cliff cliff15 = new Cliff();
        addObject(cliff15,166,214);
        cliff15.setLocation(161,204);
        Cliff cliff16 = new Cliff();
        addObject(cliff16,559,408);
        cliff16.setLocation(553,402);
        Cliff cliff17 = new Cliff();
        addObject(cliff17,321,144);
        cliff17.setLocation(293,121);
        Cliff cliff18 = new Cliff();
        addObject(cliff18,555,79);
        cliff18.setLocation(552,78);
        Cliff cliff19 = new Cliff();
        addObject(cliff19,607,85);
        cliff19.setLocation(600,78);
        RealityAnchor realityanchor = new RealityAnchor();
        addObject(realityanchor,607,27);
        realityanchor.setLocation(602,22);
    }
}
