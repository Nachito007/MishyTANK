import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class StageClear extends World
{
    public StageClear()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        setBackground("StageClear.jpg"); 
        getBackground().scale(1200,800);
    }
    public void act(){
        if(Greenfoot.isKeyDown("SPACE")){
            Greenfoot.setWorld(new World2());
        }
    }
}

