import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int high = 135;
    private int low = 45;
    private int high2 = 15;
    private int low2 = 5;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Hedgehog("Hedgehog",((int)(Math.random()*high2-low2+1)+low2),((int)(Math.random()*high-low+1)+low)), 100, 100);
        addObject(new Sheep("Phillippe",0), 200, 200);
    }
}
