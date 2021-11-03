import greenfoot.*;
public class Robot extends Actor
{
    private int speed;
    private int batteryLevel;
    private String name;
    private int actTimer=4;
    public Robot(int speed, int batteryLevel, String name){
        this.speed=speed;
        this.batteryLevel=batteryLevel;
        this.name=name;
    }
    public void act() 
    {
        if(batteryLevel==0){
            move(0);
        }
        else{
            move(this.speed);
            actTimer=actTimer-1;        
            if(actTimer==0 && batteryLevel>0){
                batteryLevel=batteryLevel-1;
                actTimer=3;
            }
            if(getX()>=getWorld().getWidth()-10){
                turn(90);
                setLocation(getX()-5,getY());
            }
            else if(getY()>=getWorld().getHeight()-10){
                turn(90);
                setLocation(getX(),getY()-5);
            }
            else if(getX()<=10){
                turn(90);
                setLocation(getX()+5,getY());
            }            
            else if(getY()<=10){
                turn(90);
                setLocation(getX(),getY()+5);
            }
        }
        getWorld().showText(toString(),(getWorld().getWidth()/2),(getWorld().getHeight()/2));       
    }
    public String toString(){
        return "Name: " + this.name + "\n" +"Speed: " + this.speed + "\n" + "Battery Level: " + this.batteryLevel;
    }
}
