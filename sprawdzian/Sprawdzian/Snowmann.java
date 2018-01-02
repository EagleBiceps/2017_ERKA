import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snowmann here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snowmann extends Actor
{
    /**
     * Act - do whatever the Snowmann wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        obrot();
    } 
    public void obrot()
    {
        int a=Greenfoot.getRandomNumber(135-45)+45;
        turn(a);
    }
}
