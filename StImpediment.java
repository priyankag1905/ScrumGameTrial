import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Impediment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StImpediment extends State
{
    /**
     * Act - do whatever the Impediment wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ScrumBoard world;
    public void act() 
    {
         world = (ScrumBoard) getWorld();// Add your action code here.
    }    
    
    
      public void stateMove()
    {
        System.out.println("Impediment");
         CImpediment cardImp = new CImpediment();
                   System.out.println(world);
        world.addObject(cardImp,250,230);
    }
}
