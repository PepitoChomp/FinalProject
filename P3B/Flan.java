import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
public class Flan extends Actor
{
    private int x;
    private int y;
    private int speed;
    private int d;
    private int x1;
    private int y1;
    public Flan(int x1, int y1, int speed){
        this.x1=x1;
        this.y1=y1;
        this.speed=speed;
    }
    public void act() 
    {
        move(speed);
        x=getX();
        y=getY();
        getWorld().showText(toString(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        if(isAtEdge()){
            turn(70);
        }
    }    
    public double calcTripDistance(){
        return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
    }
    public String toString(){
        return "Speed: "+speed+"\n"+"X,Y: "+getX()+","+getY()+"\n"+"Distance: "+calcTripDistance()+" km";
    }
}
