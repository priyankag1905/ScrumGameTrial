import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrumBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class ScrumBoard extends World
{
    public int[][] dayBoard;
    public Cell[] mainBoard;
    public Peg1 peg;
    private DayMarker dm;
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
        createDayBoard();
        dm = new DayMarker();
        scrumdice1 = new ScrumDice();
        
        addObject(scrumdice1, 70,100);
        addObject(dm,dayBoard[0][0],dayBoard[0][1]);
        //addObject(new ScrumDice(), 20,150);
        //addObject(new ProgressDice(), 20,210);
        //addObject(new ProgressDice(), 20,260);
        //addObject(new ProgressDice(), 20,310);

        peg = new Peg1();
        addObject(peg,mainBoard[0].location[0],mainBoard[0].location[1]);
       
    }
    public Peg1 getPeg()
    {
        return peg;
    }
    public DayMarker getDayMarker()
    {
        return dm;
    }
    public void createDayBoard()
    {
        dayBoard = new int[][] {{622,48},
                              {659,48},
                              {696,48},
                              {733,48},
                              {770,48},
                              {622,86},
                              {659,86},
                              {696,86},
                              {733,86},
                              {770,86}};
    }
    
    public void createBoard()
    {
        mainBoard = new Cell[21];
        StStart start = new StStart();
        addObject(start,0,0);
        StEndOfDays eod = new StEndOfDays();
        addObject(eod,0,0);
        StImpediment impediment = new StImpediment();
        addObject(impediment,0,0);
        StOpportunity opp = new StOpportunity();
        addObject(opp,0,0);
        StTool tool = new StTool();
        addObject(tool,0,0);
        StProgressReporting pr = new StProgressReporting();
        addObject(pr,0,0);
        StBurndown b50 = new StBurndown(50);
        StBurndown b25plus = new StBurndown(25);
        StBurndown b25minus = new StBurndown(-25);
        addObject(b50,0,0);
        addObject(b25plus,0,0);
        addObject(b25minus,0,0);
        StAdditionalDie adddie= new StAdditionalDie();
        addObject(adddie,0,0);
        
        mainBoard[0]= new Cell(start,new int[]{20,430});
        mainBoard[1]= new Cell(b50,new int[]{90,430});
        mainBoard[2]= new Cell(adddie,new int[]{140,430});
        mainBoard[3]= new Cell(b25plus,new int[]{200,430});
        mainBoard[4]= new Cell(b25minus,new int[]{260,430});
        mainBoard[5]= new Cell(b50,new int[]{310,430});
        mainBoard[6]= new Cell(eod,new int[]{450,430});
        mainBoard[7]= new Cell(impediment,new int[]{579,373});
        mainBoard[8]= new Cell(opp,new int[]{610,307});        
        mainBoard[9]= new Cell(tool,new int[]{610,245});
        mainBoard[10]= new Cell(eod,new int[]{586,185});
        mainBoard[11]= new Cell(impediment,new int[]{542,142});
        mainBoard[12]= new Cell(opp,new int[]{485,117});
        mainBoard[13]= new Cell(tool,new int[]{420,117});
        mainBoard[14]= new Cell(eod,new int[]{364,149});
        mainBoard[15]= new Cell(pr,new int[]{306,182});
        mainBoard[16]= new Cell(impediment,new int[]{286,247});
        mainBoard[17]= new Cell(opp,new int[]{294,309});
        mainBoard[18]= new Cell(tool,new int[]{329,365});
        //mainBoard[19]= new Cell(new StEndOfDays(),new int[]{450,430});
        //mainBoard[20]= new Cell(new StSprintReview(),new int[]{708,426});
  }
}
