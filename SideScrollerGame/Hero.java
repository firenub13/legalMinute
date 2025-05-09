import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int cooldown = 0;
    int moveSpeed = 0;
    int rotationSpeed = 0;
    //constructor for Hero - methods are run once when a Hero actor is addded
    public Hero(){ 
    
    
    }
    
    public void act()
    {
        setRotation(getRotation()+rotationSpeed); //reset rotation to straight
        move(moveSpeed);
        
        if(Greenfoot.isKeyDown("w") && moveSpeed<6){
            moveSpeed+=1;
        }else if(moveSpeed>0){
            moveSpeed-=1;
        }
        if (moveSpeed<0){
            moveSpeed=0;
        }
        if (moveSpeed>5){
            moveSpeed=5;
        }
        if(Greenfoot.isKeyDown("a") && rotationSpeed> -6){
            rotationSpeed-=1;
        }else if (rotationSpeed<0){
            rotationSpeed+=1;
        }
        if (rotationSpeed>5){
            rotationSpeed=5;
        }
        if(Greenfoot.isKeyDown("d") && rotationSpeed< 6){
            rotationSpeed+=1;
        }else if (rotationSpeed>0){
            rotationSpeed-=1;
        }
        if (rotationSpeed<-5){
            rotationSpeed= -5;
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
