import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    /**
     * Act - do whatever the Pig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        klawisze();
        balwan();
        teleport();
    }   

    public void klawisze()
    {
        if(Greenfoot.isKeyDown("right"))move (2);
        if(Greenfoot.isKeyDown("left"))move (-2);
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move (2);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(90);
            move (2);
            turn(-90);
        }
        if(Greenfoot.isKeyDown("p"))
        {
            turn(-45);
            move (4);
            turn(45);
        }

    }

    public void balwan()
    {
        if(isTouching(Snowmann.class))
        {
            World swiat;
            swiat = getWorld();
            int x,y;
            x=Greenfoot.getRandomNumber(600);
            y=Greenfoot.getRandomNumber(400);
            swiat.addObject( new Snowmann(), x, y);
        }
    }

    public void teleport()
    {
        if(isTouching(Snowmann.class))
        {
            World swiat;
            swiat = getWorld();
            do{
                int a=Greenfoot.getRandomNumber(600);
                int b=Greenfoot.getRandomNumber(400);
                setLocation(a,b);
            }while(isTouching(Snowmann.class));
        }
    }
}
