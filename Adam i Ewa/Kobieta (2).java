import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kobieta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kobieta extends Czlowiek
{
    /**
     * Act - do whatever the Kobieta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")) move(2);
        if(Greenfoot.isKeyDown("left")) move(-2);
        if(Greenfoot.isKeyDown("down")) 
        {
            turn(90);
            move(2);
            turn(-90);
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            turn(90);
            move(-2);
            turn(-90);
        }
        if(Greenfoot.isKeyDown("space")) 
        {
            int x,y;
            x=getX();
            y=getY();
            
            World world;
            world=getWorld();
            
            Jablko jablko;
            jablko = new Jablko();
            
            if(!isTouching(Jablko.class))world.addObject(jablko,x,y);
            
            
            
           
            
           
           
           

        }

    }    
}
