import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scrum extends Die
{   
     private int rolling = 0;
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
               setImage("1.png");
            }
            if (xx == 2)
             {
               setImage("2.png");
            }
            if (xx == 3)
             {
               setImage("3.png");
            }
            if (xx == 4)
             {
               setImage("4.png");
            }
            if (xx == 5)
             {
               setImage("5.png");
            }
            if (xx == 6)
             {
               setImage("6.png");
            }
          }          
        }
        
   
        public int getNum()
   {
       return num;
    }
}
