import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class RealityAnchor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RealityAnchor extends Actor
{
    public boolean perish = false;
    public boolean IsActive = false;

    private boolean doAnimation = false;
    private int TimeStep = 1;
    private int frame = 0;
    final static int TickPeriode = 20;
    int offset = 30;
    Pengu pengu;
    public void act() {
        if(!perish){


        if(IsActive){
        if (isOutsideWorldBounds(pengu)) {
            teleportBack(pengu);
        }

        }else if (doAnimation){
            TimeStep++;
            setImage("flag_"+frame+".png");
            if(TimeStep % TickPeriode == 0){
                frame++;
                if(frame >=4){
                List<RealityAnchor> anchors = getWorld().getObjects(RealityAnchor.class);
                for(RealityAnchor anchor : anchors){
                    if(anchor != this && anchor.IsActive == true){ 
                        anchor.perish = true; 
                        anchor.setImage("flag_0.png"); 
                    }
                }
                    
                    pengu.CurrentCheckpoint = this;
                    this.IsActive = true;
                }
            }
        }else{
                pengu = (Pengu) this.getOneIntersectingObject(Pengu.class);
                if (pengu != null) {
                    doAnimation = true;
                  
                }
        }}
    }

    private boolean isOutsideWorldBounds(Actor actor) {
        World world = getWorld();
        int x = actor.getX();
        int y = actor.getY();
        return x < offset || y < offset || x >= world.getWidth()-offset || y >= world.getHeight()-offset;
    }

    public void teleportBack(Pengu pengu) {
        pengu.setLocation(getX(), getY());
    }
}
