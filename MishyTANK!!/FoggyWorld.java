import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class FoggyWorld extends World
{
    Crosshair cross;
    Launcher launch;
    int counter;
    public FoggyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200,800, 1); 
        setBackground("FoggyWorld2.jpg");
        getBackground().scale(1200,800);
        cross = new Crosshair();
        addObject(cross,getWidth()/2,getHeight()/2);
        launch = new Launcher();
        addObject(launch,getWidth()/2,750);
        for (int i=0;i<10;i++){
            if (i!=4 && i!=5){
                addObject(new Base(),i*120+60,750);
            }
        }
        counter = 0;
        
    }
    
    public void act() {
        counter++;
        Missile.playerspeed = 50;
        if(counter>180){
            counter = 0;
            Enemy.Speed = 15;
            addObject(new Enemy(),Greenfoot.getRandomNumber(1024) ,300);
       }
       
       List A = getObjects(Base.class);
       if (A.size()==0) {
           Greenfoot.setWorld(new GOver());
        }
        
    }
}
