import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrumBoard  extends World
{
    public int[][] dayBoard;
    public Cell[] mainBoard;
    private COpportunity oppurtunity;
    private ProgressDice progressdie;
    private CImpediment impedi;
    public ScrumDice scrumdie;
    private DayMarker dm;
    private CTool tool;
    public Peg1 peg;
    private Rolled r;
    
    public ScrumBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1063,428, 1);                
        prepare();
    }


    /**
* Prepare the world for the start of the program. That is: create the initial
    * objects and add them to the world.
    */
    private void prepare()
    {
        createBoard();
        createDayBoard();
        dm = new DayMarker();
        addObject(dm,dayBoard[0][0],dayBoard[0][1]);
        scrumdie = new ScrumDice ();
        addObject(scrumdie, 100,340);
        progressdie = new ProgressDice();
        addObject(progressdie, 100,100);
        tool = new CTool ();
        addObject(tool, 870,100);
        oppurtunity = new COpportunity();
        addObject(oppurtunity, 870,340);
        impedi = new CImpediment();
        addObject(impedi, 1000,240);
        peg = new Peg1();
        addObject(peg,mainBoard[0].location[0],mainBoard[0].location[1]);
        r = new Rolled ("Last Rolled: ");
        addObject(r,100,170);
    }
    
      public Peg1 getPeg()
    {
        return peg;
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
    
    public DayMarker getDayMarker()
    {
        return dm;
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
        
        
        
        
        mainBoard = new Cell[21];
        mainBoard[0]= new Cell(new StStart(),new int[]{200,350});
        mainBoard[1]= new Cell(new StBurndown(50),new int[]{250,350});
        mainBoard[2]= new Cell(new StAdditionalDie(),new int[]{300,350});
        mainBoard[3]= new Cell(new StBurndown(25),new int[]{340,350});
        mainBoard[4]= new Cell(new StBurndown(-25),new int[]{380,350});
        mainBoard[5]= new Cell(new StBurndown(50),new int[]{430,350});
        mainBoard[6]= new Cell(new StEndOfDays(),new int[]{530,350});
        mainBoard[7]= new Cell( impediment,new int[]{630,300});
        mainBoard[8]= new Cell( opp,new int[]{660,255});
        mainBoard[9]= new Cell( tool,new int[]{650,200});
        mainBoard[10]= new Cell(new StEndOfDays(),new int[]{635,160});
        mainBoard[11]= new Cell( impediment,new int[]{607,120});
        mainBoard[12]= new Cell( opp,new int[]{555,97});
        mainBoard[13]= new Cell( tool,new int[]{510,100});
        mainBoard[14]= new Cell(new StEndOfDays(),new int[]{460,120});
        mainBoard[15]= new Cell(new StSprintReview(),new int[]{430,160});
        mainBoard[16]= new Cell( impediment,new int[]{410,200});
        mainBoard[17]= new Cell( opp,new int[]{414,255});
        mainBoard[18]= new Cell( tool,new int[]{430,300});
    }
}
