import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Sheep extends Actor
{
    private static int collisionCount;
    private String name;
    private boolean yum;
    
    public Sheep(){
        name="";
        collisionCount=0;
    }
    public Sheep(String name, int collisionCount){
        this.name=name;
        this.collisionCount=collisionCount;
    }
    public void act(){
        move(5);
        turn(1);
        
        if(isAtEdge()){
            turn(180);
        }
        if(isTouching(Hedgehog.class)){
            if(yum==false){
                collisionCount++;
                System.out.println("Collision!");
                System.out.println("Collision # " + collisionCount);
                yum=true;
            }
        }
        else{
            yum=false;
        }
        getWorld().showText(toString(),(getWorld().getWidth()/4),(getWorld().getHeight()/4));
    }
    public String toString(){
        return "Name: " + name + "\n" + "X: " + getX() + "Y: " + getY();
    }
}
