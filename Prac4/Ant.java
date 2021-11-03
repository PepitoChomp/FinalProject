import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("j")){
        turn(-10);
    }  
    if(Greenfoot.isKeyDown("l")){
        turn(10);
    }   
    if(Greenfoot.isKeyDown("i")){
        move(5);
    }  
    if(Greenfoot.isKeyDown("k")){
        move(-5);
    }  
    }    
}
