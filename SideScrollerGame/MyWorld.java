import greenfoot.*;

public class MyWorld extends World
{
    // check if a sound is playing by doing sound.isPlaying()
    static GreenfootSound missile = new GreenfootSound("launch.wav");
    GreenfootSound anthem = new GreenfootSound("anthem.mp3");
    static int X = 0;
    static int lastDroneX = 500;
    int droneCooldown = 0;
    public MyWorld() //constructor methods happen once
    {    
       //'false' allows for items to be outside of the world dimensions. 
        super(800, 600, 1, false); 
        
        addObject(new City(), 1800, 460);
        addObject(new Hero(), 50, 200);
        setPaintOrder(Hero.class);
            //setPaintOrder(Hero.class, Bullet.class) determines front layer
                //Hero would be on the top layer
    }

     public void act(){
        //world commands that activate when you press run
        X+=5;
        anthem.setVolume(30);
        anthem.play();
        
        if (droneCooldown<1){
            droneCooldown = 50;
            lastDroneX+= Greenfoot.getRandomNumber(2000)+200;
            addObject(new gerome(), lastDroneX, Greenfoot.getRandomNumber(700)+100);
        }
        droneCooldown--;
        
    }
    
}
