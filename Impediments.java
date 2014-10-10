import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Impediments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Impediments extends Cards
{
    /**
     * Act - do whatever the Impediments wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         checkOpen();
    }    
    
    public void checkOpen(){
         World world = getWorld();
        if (Greenfoot.mouseClicked(this))
         {
             Message msg = new Message(" It is an Impediment ");
             world.addObject(msg, 1000,240);
         }
    }
}
