import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrumDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrumDice extends Dice
{
    private int rolling = 0;
    private int rollCount = 0;
    private boolean roller = true;
    private int timer = 0;
    private int num = 0;
    ScrumBoard world ;
    private boolean roll =  false;
    public void act() 
    {
        super.act();
       // if (!isConnected())
        //    return;
        
        world = (ScrumBoard) getWorld();
                  
        UserData[] us = world.getTrackedUsers();
       
        boolean anyLeftHandUp = false;
        
        for (UserData u: us)
        {
           
            anyLeftHandUp = anyLeftHandUp || (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY());
             Joint rightHand = u.getJoint(Joint.RIGHT_HAND);
           
           /* if (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY())
            {
               
                
                
                System.out.println("ROLL");
            }*/
            
           
        }
        
              
        if (anyLeftHandUp)
        {
          
            System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
           
            roll = true;
        }
            
            
            
            
            
            
        
        world = (ScrumBoard) getWorld();
       checkThrow();
       
       
       
       
       
       
       
    }
    
    private void roll()
    {
    if(roller == true)
    {
        rolling++;
        timer ++;
    }
    
    if(timer > 100){
        roller = false;
        timer = 0;
    }
    
    if(rolling == 10)
    {
            setImage("1.png");
            Greenfoot.delay(10);  
            
        }
    else if(rolling == 20)
        {
            setImage("2.png");
            Greenfoot.delay(10);
           
    }
    else if(rolling == 30)
        {
            setImage("3.png");
            Greenfoot.delay(10);
            
    }
    else if(rolling == 40)
        {
            setImage("4.png");
            Greenfoot.delay(10);
           
    }
    else if(rolling == 50)
        {
            setImage("5.png");
            Greenfoot.delay(10);
            
    }
    else if(rolling == 60)
        {
            setImage("6.png");
            Greenfoot.delay(10);
            rolling = 0;
            
    }else { 
           
    }
    
}
private void checkThrow()
{
    if (/*roll*/Greenfoot.mouseClicked(this))
         {
             roller = true;
             for(int i =0; i < 200 ;i++){
            if(roller == true){
                roll();
            }else {
                break;
            }
            }
             roller = false;
             int xx = Greenfoot.getRandomNumber(6);
             if(xx == 0)
             {
                 xx = 6;
                }
             num = xx;
             if (xx == 1)
             {
               setImage("1.png");
               world.peg.movePeg(xx);
            }
            if (xx == 2)
             {
               setImage("2.png");
               world.peg.movePeg(xx);
            }
            if (xx == 3)
             {
               setImage("3.png");
                world.peg.movePeg(xx);
            }
            if (xx == 4)
             {
               setImage("4.png");
               world.peg.movePeg(xx);
            }
            if (xx == 5)
             {
               setImage("5.png");
                world.peg.movePeg(xx);
            }
            if (xx == 6)
             {
               setImage("6.png");
               world.peg.movePeg(xx);
            }
          }         
          
          
            roll = false;
        }
       
       
   public int getNum()
    {
//            int num=Greenfoot.getRandomNumber(5)+1;
//             System.out.println("output:"+num);
//             Message m = new Message(Integer.toString(num)) ;
//             ScrumBoard world = (ScrumBoard) getWorld();
//             ScrumDice dice = (ScrumDice) getWorld().getObjects(ScrumDice.class).get(0); 
//              String img = num+".png";
//             dice.setImage(img);
            return num;
    }
}
