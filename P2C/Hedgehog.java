import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hedgehog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hedgehog extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    private int high = 135;
    private int low = 45;
    private int high2 = 15;
    private int low2 = 5;
    public Hedgehog(){
        name="";
        speed=0;
        turnAmount=0;
    }
    public Hedgehog(String name, int speed, int turnAmount){
        this.name=name;
        this.speed=speed;
        this.turnAmount=turnAmount;
    }

    public void act() 
    {
        move(this.speed);
        turn(2);
        if(isAtEdge()){
            turn(this.turnAmount);
            this.turnAmount=((int)(Math.random()*high-low+1)+low);
            this.speed=((int)(Math.random()*high2-low2+1)+low2);
        }
        getWorld().showText(toString(),(getWorld().getWidth()/2),(getWorld().getHeight()/2));
    }    
    public String toString(){
        return "Name: " + (name) + "\n" + "Speed: " + (speed) + "\n" + "TurnAmount: " + (turnAmount) + "\n" + "X: " + (getX()) + "\n" + "Y: " + (getY());
    }
}
