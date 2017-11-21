import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hipo extends Actor
{
    int kierunek=1;
    
    /**
     * Act - do whatever the Hipo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your acmove(kierunek)
        move(kierunek);
       if(isAtEdge())kierunek=kierunek*(-1);
       
       
     
    } 
}
    
