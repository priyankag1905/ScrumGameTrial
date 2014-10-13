import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StTool extends State
{
    /**
     * Act - do whatever the Tool wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ScrumBoard world;
    public void act() 
    {
         world = (ScrumBoard) getWorld();
    }    
    
      public  void stateMove()
    {
         System.out.println("Tool");
          CTool cardTool = new CTool();
        world.addObject(cardTool,100,300);
    }
    
}
