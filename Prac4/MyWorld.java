import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int timer = 0;
        for(int i=0; i<26; i++){
        addObject(new Gator(), (int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
        addObject(new Ant(), (int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));

    }
}
}