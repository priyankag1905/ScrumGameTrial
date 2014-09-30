import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrumBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class ScrumBoard extends World
{
    public Cell[] mainBoard;
    public Peg1 peg;
    public ScrumDice scrumdice1;
    /**
     * Constructor for objects of class ScrumBoard.
     * 
     */
    public ScrumBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 502, 1); 
        prepare();
    }
    
    public void prepare()
    {
        createBoard();
        scrumdice1 = new ScrumDice();
        addObject(scrumdice1, 20,100);
        addObject(new ScrumDice(), 20,150);
        addObject(new ProgressDice(), 20,210);
        addObject(new ProgressDice(), 20,260);
        addObject(new ProgressDice(), 20,310);
        peg = new Peg1();
        addObject(peg,mainBoard[0].location[0],mainBoard[0].location[1]);
//        int[] location = new int[]{586,185};
//        addObject(new Cell(new StStart(),location),location[0],location[1]);
        
    }
    public Peg1 getPeg()
    {
        return peg;
    }
    public void createBoard()
    {
        mainBoard = new Cell[21];
        mainBoard[0]= new Cell(new StStart(),new int[]{20,430});
        mainBoard[1]= new Cell(new StBurndown(50),new int[]{90,430});
        mainBoard[2]= new Cell(new StAdditionalDie(),new int[]{140,430});
        mainBoard[3]= new Cell(new StBurndown(25),new int[]{200,430});
        mainBoard[4]= new Cell(new StBurndown(-25),new int[]{260,430});
        mainBoard[5]= new Cell(new StBurndown(50),new int[]{310,430});
        mainBoard[6]= new Cell(new StEndOfDays(),new int[]{450,430});
        mainBoard[7]= new Cell(new StImpediment(),new int[]{579,373});
        mainBoard[8]= new Cell(new StOpportunity(),new int[]{610,307});        
        mainBoard[9]= new Cell(new StTool(),new int[]{610,245});
        mainBoard[10]= new Cell(new StEndOfDays(),new int[]{586,185});
        mainBoard[11]= new Cell(new StImpediment(),new int[]{542,142});
        mainBoard[12]= new Cell(new StOpportunity(),new int[]{485,117});
        mainBoard[13]= new Cell(new StTool(),new int[]{420,117});
        mainBoard[14]= new Cell(new StEndOfDays(),new int[]{364,149});
        mainBoard[15]= new Cell(new StProgressReporting(),new int[]{306,182});
        mainBoard[16]= new Cell(new StImpediment(),new int[]{286,247});
        mainBoard[17]= new Cell(new StOpportunity(),new int[]{294,309});
        mainBoard[18]= new Cell(new StTool(),new int[]{329,365});
        mainBoard[19]= new Cell(new StEndOfDays(),new int[]{450,430});
        mainBoard[20]= new Cell(new StSprintReview(),new int[]{708,426});
  }
}
