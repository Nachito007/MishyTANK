import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base extends Actor
{
    int count;
    public Base(){
        getImage().scale(100,100);
        count = 0;
    }
    public void act() 
    {
        Actor hit = getOneIntersectingObject(Enemy.class);
        if(hit!=null){
            getWorld().addObject(new EXPLODE(),hit.getX(),hit.getY());
            
            getWorld().removeObject(hit);
            count++;
        }
        if(count>5){
            setImage("MC_PlantD.png");
            getImage().scale(100,100);
        }
        if(count>10){
            getWorld().removeObject(this);
            
        }
    }    
}
