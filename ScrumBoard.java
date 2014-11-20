import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrumBoard  extends KinectWorld
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
    
     private static final int THUMBNAIL_WIDTH = 80;//1063;
    private static final int THUMBNAIL_HEIGHT = 60;//428;
    
    private long leftHandUp;
    private Label leftHandWarning;
    
    
    
    
    public ScrumBoard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       // super(1063,428, 1,false);                
       // prepare();
        
        
        
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);
        prepare();
        final int width = getWidth();
        final int height = getHeight();
        
       // addObject(new Brush(width, height), width/2, height/2);
        //addObject(new Instructions(), width/2, height/2);
        addObject(new Thumbnail(), width - THUMBNAIL_WIDTH/2, height - THUMBNAIL_HEIGHT/2);
       
       // Label instr = new Label("Use your right hand to paint, raise left hand to clear.", 20);
       // addObject(instr, instr.getImage().getWidth() / 2, getBackground().getHeight() - (instr.getImage().getHeight() / 2));
        
        
    }
    
   /*  public void act()
    {
        super.act();
        if (!isConnected())
            return;
                 
        UserData[] us = getTrackedUsers();
        //getBackground().setColor(java.awt.Color.WHITE);
       // getBackground().fill();
        
        boolean anyLeftHandUp = false;
        
        for (UserData u: us)
        {
            //Draws their stick figure:
           // u.drawStickFigure(getBackground(), 60);
            
            anyLeftHandUp = anyLeftHandUp || (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY());
             Joint rightHand = u.getJoint(Joint.RIGHT_HAND);
            //getImage().fillOval(rightHand.getX(), rightHand.getY(), 20, 20);

            if (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY())
            {
                //getImage().clear();
                
                
                System.out.println("ROLL");
            }
            
           
        }
        
        // This is extra code used to warn the user if any of them is keeping their
        // left hand in the air, which effectively prevents any painting because
        // the brush will be cleared every frame:        
        if (anyLeftHandUp)
        {
        
            if (leftHandUp == -1)
            {
                leftHandUp = System.currentTimeMillis();
            }
            else
            {
                if (System.currentTimeMillis() - leftHandUp > 5000 && leftHandWarning == null)
                {
                    leftHandWarning = new Label("Put your left hand down to stop clearing the screen.", 40);
                    addObject(leftHandWarning, getWidth() / 2, getHeight() / 2);
                }
            }
        }
        else
        {
            leftHandUp = -1;
         
            
            if (leftHandWarning != null)
            {
                removeObject(leftHandWarning);
                leftHandWarning = null;
            }
        }
    }
    
*/

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
