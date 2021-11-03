import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1); 
        addObject(new Bee(), 100, 100);
        addObject(new Bee(), 100, 200);
    }
}
