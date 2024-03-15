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
        addObject( new  Pengu(), 56,567);
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
        Spike spike = new Spike(0);
        addObject(spike,239,576);
        Cliff cliff = new Cliff();
        addObject(cliff,239,576);
        Cliff cliff2 = new Cliff();
        addObject(cliff2,528,579);
        Cloud cloud = new Cloud(true,3);
        addObject(cloud,323,567);
        Cliff cliff3 = new Cliff();
        addObject(cliff3,627,525);
        Cliff cliff4 = new Cliff();
        addObject(cliff4,582,433);
        cliff3.setLocation(567,532);
        cliff4.setLocation(614,487);
        cliff2.setLocation(485,574);
        cliff3.setLocation(545,515);
        cliff4.setLocation(567,478);
        Cliff cliff5 = new Cliff();
        addObject(cliff5,627,431);
        Cliff cliff6 = new Cliff();
        addObject(cliff6,473,404);
        cliff6.setLocation(483,417);
        Cliff cliff7 = new Cliff();
        addObject(cliff7,345,422);
        cliff7.setLocation(365,426);
        Cliff cliff8 = new Cliff();
        addObject(cliff8,57,420);

        cliff8.setLocation(55,426);
        cliff6.setLocation(473,420);
        cliff7.setLocation(390,426);
        Spike spike2 = new Spike(0);
        addObject(spike2,432,394);
        cliff7.setLocation(391,422);
        spike2.setLocation(436,403);
        cliff7.setLocation(394,413);
        cliff8.setLocation(153,421);
        Cliff cliff9 = new Cliff();
        addObject(cliff9,22,335);
        Cliff cliff10 = new Cliff();
        addObject(cliff10,121,335);
        Cliff cliff11 = new Cliff();
        addObject(cliff11,116,427);
        cliff10.setLocation(117,308);
        cliff9.setLocation(20,316);
        cliff10.setLocation(118,321);
        cliff11.setLocation(119,400);
        Cliff cliff12 = new Cliff();
        addObject(cliff12,65,426);
        Cloud cloud3 = new Cloud(false,0);
        addObject(cloud3,76,316);
        cliff11.setLocation(118,420);
        cliff8.setLocation(154,425);
        cliff7.setLocation(387,421);
        cliff6.setLocation(479,432);
        cliff4.setLocation(594,485);
        cliff3.setLocation(537,529);
        cliff11.setLocation(82,441);
        cliff11.setLocation(123,434);
        removeObject(cliff8);
        cliff11.setLocation(116,450);
        removeObject(cliff11);
        cliff12.setLocation(81,441);
        cliff12.setLocation(75,412);
        RealityAnchor realityAnchor = new RealityAnchor();
        addObject(realityAnchor,56,567);
        cliff12.setLocation(83,411);
        cliff6.setLocation(538,377);
        cliff4.setLocation(571,484);
        removeObject(cliff6);
        spike2.setLocation(418,395);
        spike2.setLocation(491,372);
        removeObject(spike2);
        cliff7.setLocation(622,269);
        cliff7.setLocation(611,264);
        cliff12.setLocation(505,361);
        cliff12.setLocation(525,324);
        cliff7.setLocation(571,320);
        removeObject(cliff5);
        cliff7.setLocation(621,390);
        cliff12.setLocation(535,384);
        cloud3.setLocation(587,387);
        cliff12.setLocation(539,367);
        cliff7.setLocation(616,359);

        cliff10.setLocation(526,230);
        cliff9.setLocation(640,237);
        cliff9.setLocation(628,258);
        cliff10.setLocation(545,261);
        spike.setLocation(172,600);
        cliff4.setLocation(574,554);
        cliff3.setLocation(567,524);
        removeObject(cliff3);
        cliff2.setLocation(526,578);
        cliff4.setLocation(572,495);
        cliff2.setLocation(535,567);
        cliff4.setLocation(569,504);
        cliff7.setLocation(630,376);
        cliff9.setLocation(635,261);
        cliff10.setLocation(541,259);
        removeObject(cliff10);
        removeObject(cliff12);
        removeObject(cliff7);
        removeObject(cliff9);
        removeObject(cliff2);
        cliff4.setLocation(586,573);
        cloud3.setLocation(567,476);
        cloud.setLocation(319,579);
        cloud3.setLocation(563,472);
        cliff4.setLocation(470,573);
        cloud.setLocation(333,557);

        Cliff cliff13 = new Cliff();
        addObject(cliff13,26,355);

        Cliff cliff14 = new Cliff();
        addObject(cliff14,636,357);
        cloud3.setLocation(549,471);
        cliff13.setLocation(35,348);
        Spike spike3 = new Spike(0);
        addObject(spike3,337,347);
        spike3.setLocation(347,361);
        spike3.setLocation(334,364);
        spike3.setLocation(338,346);
        spike3.setLocation(338,359);
        RealityAnchor realityAnchor2 = new RealityAnchor();
        addObject(realityAnchor2,21,311);
        cloud3.setLocation(552,475);
        cliff14.setLocation(642,355);

        cliff4.setLocation(488,571);
        cliff4.setLocation(471,578);
        cliff13.setLocation(30,319);
        Cloud cloud9 = new Cloud(false, 0);
        addObject(cloud9,38,172);
        cloud9.setLocation(38,181);
        Cliff cliff15 = new Cliff();
        addObject(cliff15,84,198);
        Spike spike4 = new Spike(0);
        addObject(spike4,129,153);
        spike4.setLocation(129,162);
        Spike spike5 = new Spike(0);
        addObject(spike5,253,165);
        Spike spike6 = new Spike(0);
        addObject(spike6,369,161);
        Spike spike7 = new Spike(0);
        addObject(spike7,487,157);
        Cliff cliff16 = new Cliff();
        addObject(cliff16,187,205);
        spike5.setLocation(232,171);
        Cliff cliff17 = new Cliff();
        addObject(cliff17,300,204);
        Cliff cliff18 = new Cliff();
        addObject(cliff18,433,205);
        Cliff cliff19 = new Cliff();
        addObject(cliff19,543,200);
        Cliff cliff20 = new Cliff();
        addObject(cliff20,592,202);
        cliff19.setLocation(552,196);
        cliff20.setLocation(605,196);
        LevelEnd levelEnd = new LevelEnd(StartScreen.class);
        addObject(levelEnd,587,146);
        levelEnd.setLocation(605,153);
        cliff14.setLocation(628,369);

        spike3.setLocation(393,386);

        cloud3.setLocation(553,488);
        cliff14.setLocation(615,394);
        cliff14.setLocation(621,390);
        cliff13.setLocation(50,301);
        cliff13.setLocation(38,378);
        realityAnchor2.setLocation(33,326);

        Cloud cloud6 = new Cloud(false, 4);
        addObject(cloud6,525,395);
        spike3.setLocation(172,396);
        spike3.setLocation(181,406);
        spike3.setLocation(188,395);
        spike3.setLocation(192,380);
        cliff15.setLocation(107,199);
        spike3.setLocation(478,403);
        cliff18.setLocation(426,198);
        cloud3.setLocation(553,520);
        cliff14.setLocation(606,478);
        cloud3.setLocation(552,552);
        cliff14.setLocation(611,421);
        cloud6.setLocation(536,417);
        cloud6.setLocation(533,414);
        removeObject(spike3);
        cloud6.setLocation(514,397);
        cliff14.setLocation(613,422);
        cloud3.setLocation(573,510);
        cliff13.setLocation(35,366);
        cliff13.setLocation(27,296);
        cliff13.setLocation(20,373);

        cliff15.setLocation(66,237);
        cliff15.setLocation(94,215);

        cloud9.setLocation(28,246);
        spike4.setLocation(147,190);
        removeObject(spike5);
        cliff17.setLocation(282,211);
        cliff16.setLocation(189,197);
        spike4.setLocation(159,186);
        cliff16.setLocation(221,206);
        removeObject(spike6);
        cliff18.setLocation(406,198);
        spike7.setLocation(465,180);
        cliff19.setLocation(528,218);
        cliff19.setLocation(522,215);
        cliff18.setLocation(430,198);
        cliff17.setLocation(316,212);
        spike7.setLocation(467,202);
        spike4.setLocation(150,211);
        cliff16.setLocation(186,226);
        spike4.setLocation(167,228);
        cliff16.setLocation(188,208);
        spike4.setLocation(153,224);
        spike4.setLocation(133,232);
    }
}
