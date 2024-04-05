import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Launcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Launcher extends Actor
{
    /**
     * Act - do whatever the Launcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         MouseInfo mouse = Greenfoot.getMouseInfo();
         if (mouse!=null)
            turnTowards(mouse.getX(),mouse.getY());
    }    
}
