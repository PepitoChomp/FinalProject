import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int spawnTimer;
    
    /*private void checkForSpawning() // call from act method
    {
        while(spawnTimer>0){
            spawnTimer--;
        }
        if (spawnTimer == 0) // at each timer reset
        {
            getWorld().addObject(new Apple(), (int)(Math.random()*getWorld().getWidth()), (int)(Math.random()*getWorld().getHeight()));
            spawnTimer = (spawnTimer+1)%300;
        }
    }
    */
    public void act() 
    {
        move(5);
        if(isAtEdge()){
            turn(30);
        }
        //checkForSpawning();
        getWorld().addObject(new Apple(), (int)(Math.random()*getWorld().getWidth()), (int)(Math.random()*getWorld().getHeight()));
    }    
    
}
