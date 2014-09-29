import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrumDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrumDice extends Dice
{
    /**
     * Act - do whatever the ScrumDice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    } 
    
    public int roll()
    {
         int num=Greenfoot.getRandomNumber(5)+1;
            System.out.println("output:"+num);
            Message m = new Message(Integer.toString(num)) ;
            ScrumBoard world = (ScrumBoard) getWorld();
            world.addObject( m, 50,100 ) ;
            return num;
    }
}
