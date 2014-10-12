import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peg1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peg1 extends Peg
{ 
    /**
     * Act - do whatever the Peg1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Peg1()
    {
        
    }
    
    public void act() 
    {
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
