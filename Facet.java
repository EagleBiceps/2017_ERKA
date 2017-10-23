import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Facet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facet extends Kobieta
{
    /**
     * Act - do whatever the Facet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("d")) move(2);
        if(Greenfoot.isKeyDown("a")) move(-2);
        if(Greenfoot.isKeyDown("s")) 
        {
            turn(90);
            move(2);
            turn(-90);
        }
         if(Greenfoot.isKeyDown("w")) 
        {
            turn(90);
            move(-2);
            turn(-90);
        }
        
        if(isTouching(Jablko.class))
        {
            removeTouching(Jablko.class);
        }
    }    
}
