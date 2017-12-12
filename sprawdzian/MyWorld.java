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
        super(1200, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pig pig = new Pig();
        addObject(pig,803,256);
        Snowman snowman = new Snowman();
        addObject(snowman,386,473);
        Snowman snowman2 = new Snowman();
        addObject(snowman2,576,257);
        Snowman snowman3 = new Snowman();
        addObject(snowman3,795,467);
        pig.setLocation(595,386);
    }
}
