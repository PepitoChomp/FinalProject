import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private String name;
    private int high = 135;
    private int low = 45;
    public Car(){
        this.speed=5;
        this.name="Connor's Janky Miata";
    }
    public Car(int speed){
        this.speed=speed;
        this.name=name;

    }
    public void act() 
    {
        move(this.speed);
        if(isAtEdge()){
            turn((int)(Math.random()*(high-low+1)+low));
        }
        getWorld().showText(toString(),(getWorld().getWidth()/2),(getWorld().getHeight()/2));
    }    
    public String toString(){
        return "Name of Car is: " + (name) + "\n" + "Speed is: " + (speed) + "\n" + "X is: " + (getX()) + "\n" + "Y is: " + (getY());
    }
}
