import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opppurtunity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oppurtunity extends Cards
{
    /**
     * Act - do whatever the Opppurtunity wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      checkOpen();
    }    
    
    public void checkOpen(){
         World world = getWorld();
        if (Greenfoot.mouseClicked(this))
         {
             Message msg = new Message(" It is an Oppurtunity ");
             world.addObject(msg, 870,340);
         }
    }   
}
