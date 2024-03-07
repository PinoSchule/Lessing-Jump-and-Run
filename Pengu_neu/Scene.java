import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * This is the whole scene. It creates and contains the objects that are in it.
 */
public class Scene extends World
{

    /**
     * 
     */
    public Scene()
    {
        super(1500, 750, 1);
        addObject( new  Cliff(true), 665, 441);
        addObject( new  Cliff(true), 85, 441);
        
        addObject( new  Cloud(), 369, 315);
        addObject( new  Pengu(), 66, 244);
    }
}
