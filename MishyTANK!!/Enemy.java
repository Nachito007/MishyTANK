import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int X,Y;
    public static int Speed = 2;
    public Enemy() {
        getImage().scale(50,20);
        X = Greenfoot.getRandomNumber(1200); 
        Y = 800;
        
    }
    public void act() 
    {
       
       turnTowards(X,Y);
       move(Speed);
       if(getY()>780){
           getWorld().addObject(new EXPLODE(),getX(),getY());
           
           
           getWorld().removeObject(this);
        }
    }    
}
