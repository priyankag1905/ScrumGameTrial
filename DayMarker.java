import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DayMarker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DayMarker extends Actor
{
    /**
     * Act - do whatever the DayMarker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    
    public void moveMarker(int day)
    {
        System.out.println("Daymarker");
        ScrumBoard world = (ScrumBoard) getWorld();
        this.setLocation(world.dayBoard[day][0],world.dayBoard[day][1]);
    }
}
