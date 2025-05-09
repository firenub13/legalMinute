import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class HeroMissle extends Actor
{
    public HeroMissle(int rot){
        setRotation(rot);
    }
    
    //code that responds to the "Run" button
    public void act()
    {
        move(10);
        
    }
}
