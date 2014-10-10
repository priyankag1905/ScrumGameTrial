import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RollWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrumWorld  extends World
{
    public Cell[] mainBoard;
    private Oppurtunity oppurtunity;
    private Progress progressdie;
    private Impediments impedi;
    private Scrum scrumdie;
    private Tools tool;
    public Peg1 peg;
    private Rolled r;
    private int previous;
    public ScrumWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1063,428, 1);                
        prepare();
    }


    public void act ()
    {
       
       //peg.movePeg(scrumdie.getNum());
       r.setNum("Last Rolled: " + scrumdie.getNum());
       if(scrumdie.getNum() < 5){
           peg.movePeg(scrumdie.getNum());
        }
    }

    /**
* Prepare the world for the start of the program. That is: create the initial
    * objects and add them to the world.
    */
    private void prepare()
    {
        createBoard();
        scrumdie = new Scrum ();
        addObject(scrumdie, 100,340);
        progressdie = new Progress ();
        addObject(progressdie, 100,100);
        tool = new Tools ();
        addObject(tool, 870,100);
        oppurtunity = new Oppurtunity();
        addObject(oppurtunity, 870,340);
        impedi = new Impediments();
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
    
    public void createBoard()
    {
        mainBoard = new Cell[21];
        mainBoard[0]= new Cell(new StStart(),new int[]{200,350});
        mainBoard[1]= new Cell(new StBurndown(50),new int[]{250,350});
        mainBoard[2]= new Cell(new StAdditionalDie(),new int[]{300,350});
        mainBoard[3]= new Cell(new StBurndown(25),new int[]{340,350});
        mainBoard[4]= new Cell(new StBurndown(-25),new int[]{380,350});
        mainBoard[5]= new Cell(new StBurndown(50),new int[]{430,350});
        mainBoard[6]= new Cell(new StEndOfDays(),new int[]{530,350});
    }
}
