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
    public void snowman()
    {
        if(isTouching(Snowman.class))
        
        {
            
            World swiat;   
                swiat = getWorld();  
                int x, y;  
                x = Greenfoot.getRandomNumber();
              
           
                y =Greenfoot.getRandomNumber();
                
          
           swiat.addObject(new Snowman(),x ,y );
            
        }
    }
    
    public void act() 
    
    { 
        snowman();
        if(Greenfoot.isKeyDown ("right"))move (2);
        if(Greenfoot.isKeyDown ("left"))move (-2);
        if(Greenfoot.isKeyDown ("up"))
        {turn(-90);
            move(2);
            turn(90);
            
         
            
        }
        
        if((Greenfoot.isKeyDown ("down")))
        {
            turn(-90);
            move(-2);
            turn(90);
            
        }
        
        if(Greenfoot.isKeyDown ("p"))
        {
            
        }
    
    }    
}
