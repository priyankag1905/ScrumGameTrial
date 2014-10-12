import greenfoot.*;
import java.awt.Color;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
        //Shows the message for 15 milliseconds and then removes it from the world.
        Greenfoot.delay(15);
        getWorld().removeObject(this);
     }  
    /**This method creates a Greenfoot image with a String message of font 30 in black
    *on an orange background.
    */ 
    public Message(String msg)
    {
        GreenfootImage gfi = new GreenfootImage(msg,30,Color.BLACK,Color.ORANGE);
        gfi.drawString(msg,250,250);
        setImage(gfi);
    }
}

