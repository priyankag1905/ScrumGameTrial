import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peg1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peg1 extends Peg
{
    int currentCell;
    /**
     * Act - do whatever the Peg1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Peg1()
    {
        currentCell=0;
    }
    
    public void act() 
    {
         if(Greenfoot.mousePressed(this)) {
           ScrumBoard world = (ScrumBoard) getWorld();
           int outcome = world.scrumdice1.roll();
           movePeg(outcome);
        }
    }
    
    public void movePeg(int val)
    {
        int newCell = (currentCell+val)%19;
        if (currentCell+val>18)
            currentCell = newCell+6;
        else currentCell = newCell;
        
        ScrumBoard world = (ScrumBoard) getWorld();
        this.setLocation(world.mainBoard[currentCell].location[0],world.mainBoard[currentCell].location[1]);
        world.addObject(world.mainBoard[currentCell].cellState,0,0);
        world.mainBoard[currentCell].cellState.stateMove();
    }
}
