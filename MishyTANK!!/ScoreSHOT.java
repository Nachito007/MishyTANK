import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ScoreSHOT extends Actor
{
    public static int scoreSHOT;
    public ScoreSHOT() {
        
    }
    public void act(){
        String text = "Shot:\n"+scoreSHOT;
        GreenfootImage image = new GreenfootImage(text,100,new Color(255,255,255),new Color(0,0,0));
        setImage(image);
     }
}
