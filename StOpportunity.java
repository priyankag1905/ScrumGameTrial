import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opportunity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StOpportunity extends State
{
    /**
     * Act - do whatever the Opportunity wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     ScrumBoard world;
    public void act() 
    {
       world = (ScrumBoard) getWorld(); // Add your action code here.
    }    
    
    
    public void stateMove()
    {
        System.out.println("Opportunity");
        COpportunity cardOpp = new COpportunity();
                 
        world.addObject(cardOpp,250,230);
    }
}
