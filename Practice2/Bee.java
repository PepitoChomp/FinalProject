import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bee extends Actor
{
    private int speed;
    public Bee(){
        this.speed=10;
    }
    public Bee(int speed){
        this.speed=speed;
    }
    public void act() 
    {
        move(this.speed);
        getWorld().showText("X is " + this.getX(),50,10);
    }    
}
