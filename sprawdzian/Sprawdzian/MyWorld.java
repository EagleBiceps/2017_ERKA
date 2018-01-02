import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig = new Pig();
        addObject(pig,306,212);
        Snowmann snowmann = new Snowmann();
        addObject(snowmann,463,96);
        Snowmann snowmann2 = new Snowmann();
        addObject(snowmann2,43,181);
        Snowmann snowmann3 = new Snowmann();
        addObject(snowmann3,172,357);
    }
}
