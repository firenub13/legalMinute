import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gerome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gerome extends Actor
{
    /**
     * Act - do whatever the gerome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int droneX = MyWorld.lastDroneX;
    public void act()
    {
        // Add your action code here.
        setLocation(droneX- MyWorld.X, getY());
    }
}
