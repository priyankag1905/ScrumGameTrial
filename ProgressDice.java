import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ProgressDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProgressDice extends Dice
{private int rolling = 0;
    private int rollCount = 0;
    private boolean roller = true;
    private int timer = 0;
    private int num = 0;
   
    public void act() 
    {
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
            setImage("dice-1.png");
            Greenfoot.delay(10);  
            
        }
    else if(rolling == 20)
        {
            setImage("dice-2.png");
            Greenfoot.delay(10);
           
    }
    else if(rolling == 30)
        {
            setImage("dice-3.png");
            Greenfoot.delay(10);
            
    }
    else if(rolling == 40)
        {
            setImage("dice-4.png");
            Greenfoot.delay(10);
           
    }
    else if(rolling == 50)
        {
            setImage("dice-5.png");
            Greenfoot.delay(10);
            
    }
    else if(rolling == 60)
        {
            setImage("dice-6.png");
            Greenfoot.delay(10);
            rolling = 0;
            
    }else { 
           
    }
    
}
private void checkThrow()
{
    if (Greenfoot.mouseClicked(this))
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
               setImage("dice-1.png");
            }
            if (xx == 2)
             {
               setImage("dice-2.png");
            }
            if (xx == 3)
             {
               setImage("dice-3.png");
            }
            if (xx == 4)
             {
               setImage("dice-4.png");
            }
            if (xx == 5)
             {
               setImage("dice-5.png");
            }
            if (xx == 6)
             {
               setImage("dice-6.png");
            }
          }          
        }
        
   
        public int getNum()
   {
       return num;
    }
}

