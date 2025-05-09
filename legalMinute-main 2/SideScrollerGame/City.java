import greenfoot.*;

//Don't need to edit this code - use for reference
public class City extends Actor
{
    GreenfootImage theBG = new GreenfootImage("Background.jpg");
    //another way to create images to an actor
        //allows for transparency to change below with a GreenfootImage method
    
    //constructor method for the city class
    //call methods 
    public City(){
        theBG.setTransparency(100);
        setImage(theBG); //set the actors costume to the Greenfoot image made above
        
    }
   
    
    public void act() 
    {
       move(-3);
       
       //can check values off the grid with an unbounded grid
       if(getX() < -1100) 
        setLocation(1800, 460);
        
    }    
}
