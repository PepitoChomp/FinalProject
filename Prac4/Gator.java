import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gator extends Actor
{
    public void act() 
    {
    if(Greenfoot.isKeyDown("a")){
        turn(-10);
    }  
    if(Greenfoot.isKeyDown("d")){
        turn(10);
    }   
    if(Greenfoot.isKeyDown("w")){
        move(5);
    }  
    if(Greenfoot.isKeyDown("s")){
        move(-5);
    }  
}
}