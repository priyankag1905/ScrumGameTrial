import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rolled here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rolled  extends Actor
{
    int previous = 0;
    public Rolled (String text)
{
 GreenfootImage img = new GreenfootImage(100,30);
 img.drawString(text,8,25);
 setImage(img); 
}
    
public void setNum (String text)
   {
       GreenfootImage img = getImage();
       img.clear();
       img.drawString(text,10,25);
   }   
   
 public void saveNum (int value)
   {
     previous = previous + value;
   }
   
public int getNum()
   {
       return previous;
   }
  
}
