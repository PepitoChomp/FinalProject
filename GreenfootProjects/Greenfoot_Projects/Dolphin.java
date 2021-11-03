import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
public class Dolphin extends Actor
{
    public void act() 
    {
        int high = 90;
        int low = 1;
        move(5);
        if(isAtEdge()){
            turn((int)(Math.random()*(high-low+1)+low));
        }
        removeTouching(Dolphin.class);
    }    
}
