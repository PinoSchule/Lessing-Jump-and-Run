import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * This is the whole scene. It creates and contains the objects that are in it.
 */
public class Scene extends World
{
   
   Levelpipe pipe1 = new Levelpipe();
   Levelpipe pipe2 = new Levelpipe();
   Pengu pengu1 = new Pengu(); 
   public void act()
   {
    pengu1.checkPipe();


   }
    /**
     * 
     */
   public Scene()
   {
       super(750, 500, 1);
       addObject( new Cliff(false), 85, 441);
       addObject( new Cliff(true), 665, 441);


       addObject( new Cloud(), 369, 315);
       addObject( pengu1, 20, 44);
       addObject(pipe1, 125, 235);
       addObject( pipe2, 625, 235);
   }
}
