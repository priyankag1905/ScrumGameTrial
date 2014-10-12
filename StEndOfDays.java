import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndOfDays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StEndOfDays extends State
{
    static int currentDay;
    int totalDays = 10;

    /**
     * Act - do whatever the EndOfDays wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
    }    
    
    public void stateMove()
    {
        addDay();
        System.out.println(currentDay);
        ScrumBoard world = (ScrumBoard) getWorld();
        ((DayMarker)world.getDayMarker()).moveMarker(currentDay);
        if(checkLastDay()) 
        {
            System.out.println("Game Over");  //Change this to call game end method
        }
    }
    
    public void addDay()
    {
        currentDay++;
    }
    
    public boolean checkLastDay()
    {
        if (currentDay == totalDays-1) return true;
        else return false;
    }
    
}
