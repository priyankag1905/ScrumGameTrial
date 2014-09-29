import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    public Message(String msg)
    {
        GreenfootImage gi;
        gi = new GreenfootImage(100,100);
        gi.setColor( java.awt.Color.YELLOW ) ;
        gi.fill() ;
        gi.setColor( java.awt.Color.BLACK ) ;
        gi.drawString( msg, 0, 50 );
        this.setImage(gi);
    }
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this)){
            World world = getWorld();
            world.removeObject(this);
        }
    }    
}
