import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CTool here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CTool extends Card
{
    /**
     * Act - do whatever the CTool wants to do. This method is called whenever
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
