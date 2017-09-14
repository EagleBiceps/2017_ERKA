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
        super(1700, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Ludz ludz = new Ludz();
        addObject(ludz,1525,424);
        ludz.setLocation(1462,422);
        ludz.setLocation(1510,574);
        Ruski ruski = new Ruski();
        addObject(ruski,390,566);
        ruski.setLocation(534,564);
        Blyat blyat = new Blyat();
        addObject(blyat,216,524);
        ruski.setLocation(459,552);
        blyat.setLocation(162,581);
        ruski.setLocation(445,584);
        blyat.setLocation(176,582);
        ruski.setLocation(279,573);
        ruski.setLocation(368,575);
        ruski.setLocation(373,562);
        Blyat blyat2 = new Blyat();
        addObject(blyat2,610,543);
        ruski.setLocation(1290,478);
        removeObject(ruski);
        Ruski ruski2 = new Ruski();
        addObject(ruski2,427,571);
        ruski2.setLocation(454,566);
        blyat.setLocation(175,583);
        blyat.setLocation(168,577);
        removeObject(blyat);
        ruski2.setLocation(434,590);
        Blyat blyat3 = new Blyat();
        addObject(blyat3,260,595);
        blyat3.setLocation(125,597);
        ruski2.setLocation(331,601);
        ruski2.setLocation(338,612);
        ruski2.setLocation(323,617);
        ruski2.setLocation(327,613);
        blyat2.setLocation(485,563);
        ludz.setLocation(1422,404);
        ludz.setLocation(1515,564);
        ruski2.setLocation(736,231);
        blyat2.setLocation(285,205);
        ruski2.setLocation(802,545);
    }
}
