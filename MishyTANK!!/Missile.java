import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Missile extends Actor
{
    int X,Y;
    public static int playerspeed = 15;
    public Missile(int EndX, int EndY) {
        getImage().scale(50,20);
        X = EndX;
        Y = EndY;
    }
    
    public void act() 
    {
       turnTowards(X,Y);
       move(playerspeed);
       Actor hit = getOneIntersectingObject(Enemy.class);
       
       if(hit!=null ||(X+playerspeed>getX() && X-playerspeed<getX() && Y+playerspeed>getY() && Y-playerspeed <getY())){
           if(hit!=null){
               getWorld().addObject(new EXPLODE(),hit.getX(),hit.getY());
               ScoreHIT.scoreHIT++;
               ScoreSHOT.scoreSHOT++;
               Greenfoot.playSound("Explode.wav");
               getWorld().removeObject(hit);
               getWorld().removeObject(this);
            }
           else{
           getWorld().addObject(new EXPLODE(), X,Y);
           ScoreSHOT.scoreSHOT++;
           getWorld().removeObject(this);
        }
       }
       
       
    }
}
