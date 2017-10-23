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
        Kobieta kobieta = new Kobieta();
        addObject(kobieta,167,472);
        Facet facet = new Facet();
        addObject(facet,769,680);
        Kobieta kobieta2 = new Kobieta();
        addObject(kobieta2,168,118);
        Facet facet2 = new Facet();
        addObject(facet2,448,352);
        kobieta2.setLocation(230,114);
    }
}
