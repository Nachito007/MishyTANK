import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Crosshair extends Actor
{
    int count;
    boolean shoot;
    
    public Crosshair() {
        count = 0;
        shoot = true;
                        
    }
    
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){   
            setLocation(mouse.getX(), mouse.getY());
            if(mouse.getButton() == 1 && shoot){
                shoot = false;
                getWorld().addObject(new Missile(mouse.getX(),mouse.getY()),getWorld().getWidth()/2,750);
                
            }
            }
        //OUTSIDE THE MOUSE IF
        if (shoot == false){
            count++;
            if(count>30){
                count = 0;
                shoot = true;
                
            }
        }
    }    
}
 