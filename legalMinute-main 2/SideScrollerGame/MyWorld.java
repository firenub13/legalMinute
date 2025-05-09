import greenfoot.*;

public class MyWorld extends World
{
    static int X = 0;
    public MyWorld() //constructor methods happen once
    {    
       //'false' allows for items to be outside of the world dimensions. 
        super(800, 600, 1, false); 
        
        addObject(new City(), 1800, 460);
        addObject(new Hero(), 50, 200);
        setPaintOrder(Hero.class);
            //setPaintOrder(Hero.class, Bullet.class) determines front layer
                //Hero would be on the top layer
        int repeats = 0;
        int lastDroneX = 0;
    }

     public void act(){
        //world commands that activate when you press run
        
        
    }
    
}
