import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CImpediment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CImpediment extends Card
{
    /**
     * Act - do whatever the CImpediment wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    ScrumBoard world;
    public void act() 
    {
        
        world=(ScrumBoard)getWorld();
         if(Greenfoot.mousePressed(this)){
      
       world.removeObject(this);
       
    }
    }    
}
