import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int cooldown = 0;
    //constructor for Hero - methods are run once when a Hero actor is addded
    public Hero(){ 
    
    
    }
    
    public void act()
    {
        setRotation(0); //reset rotation to straight
        
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
            setRotation(-10);
        }
        
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
            setRotation(+10);
        }
        if (cooldown > 0){
                cooldown--;
            }
        if(Greenfoot.isKeyDown("space")){
            if (cooldown < 1){
                getWorld().addObject(new HeroMissle(getRotation()), getX(), getY());
                cooldown = 15;
            }
    }
}
}
