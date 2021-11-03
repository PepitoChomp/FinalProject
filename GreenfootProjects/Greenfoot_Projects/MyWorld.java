import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(600, 400, 1);       
        for(int i=0; i<7; i++){
            for(int j=1; j<22; j++){
                addObject(new Dolphin(), j*200, i*200);
            }
        }
        
    }
}
