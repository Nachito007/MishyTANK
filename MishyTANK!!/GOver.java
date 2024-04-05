import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GOver extends World
{
    ScoreSHOT shot;
    ScoreHIT hit;
    public GOver()
    {    
        super(1200, 800, 1);
        hit = new ScoreHIT();
        shot = new ScoreSHOT();
        addObject(hit,200,300);
        addObject(shot,1000,300);
        setBackground("MC_Back.jpg");
        getBackground().scale(1200,800);
    }
 
}
