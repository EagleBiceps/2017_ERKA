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
        Frog frog = new Frog();
        addObject(frog,362,149);
        frog.setLocation(191,245);
        Hipo hipo = new Hipo();
        addObject(hipo,479,116);
        Hipo hipo2 = new Hipo();
        addObject(hipo2,452,292);
        Hipo hipo3 = new Hipo();
        addObject(hipo3,98,327);
        Hipo hipo4 = new Hipo();
        addObject(hipo4,104,122);
        frog.setLocation(281,193);
        hipo.setLocation(462,162);
        hipo2.setLocation(741,522);
        hipo.setLocation(711,484);
        hipo3.setLocation(681,439);
        hipo4.setLocation(656,399);

        Kangur kangur = new Kangur();
        addObject(kangur,142,626);
        Kangur kangur2 = new Kangur();
        addObject(kangur2,150,151);
        Kangur kangur3 = new Kangur();
        addObject(kangur3,1035,141);
        Kangur kangur4 = new Kangur();
        addObject(kangur4,1030,662);
        hipo.setLocation(778,417);
        hipo3.setLocation(495,599);
        hipo2.setLocation(854,686);
        hipo4.setLocation(178,230);
        hipo3.setLocation(372,691);
        kangur4.setLocation(1032,731);
        hipo2.setLocation(987,544);
        hipo.setLocation(787,279);
        kangur3.setLocation(339,489);
        kangur2.setLocation(814,258);
        kangur2.setLocation(588,144);
        kangur4.setLocation(788,589);
        Kangur kangur5 = new Kangur();
        addObject(kangur5,447,407);
        Kangur kangur6 = new Kangur();
        addObject(kangur6,193,436);
        Kangur kangur7 = new Kangur();
        addObject(kangur7,984,172);
        Kangur kangur8 = new Kangur();
        addObject(kangur8,346,163);
        Kangur kangur9 = new Kangur();
        addObject(kangur9,127,145);
        Kangur kangur10 = new Kangur();
        addObject(kangur10,602,675);
        Kangur kangur11 = new Kangur();
        addObject(kangur11,871,702);
    }
}
