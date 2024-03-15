import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike extends Actor
{
    private int type; // Instance variable
    //Constructor, hier kann man theoretisch verschiedene typen definieren. Damit anstatt immer neuer klassen zu machen, alles in diese klasse zu sandwitchen
    public Spike(int type) {
         this.type = type;
    }
    public void act(){
        if(type == 0){setImage("diamond_spike.png");}
        if(type == 1){setImage("car-4.png");}
        Pengu pengu = (Pengu) this.getOneIntersectingObject(Pengu.class);
        if(pengu != null){
        
        if(pengu.CurrentCheckpoint != null){
        
        pengu.CurrentCheckpoint.teleportBack(pengu);
        
        }else{
             try {
                Greenfoot.setWorld(StartScreen.class.newInstance());
                } catch (InstantiationException | IllegalAccessException e) {
                    System.err.println("Error instantiating next level: " + e.getMessage());
                }
    }}
}
}
