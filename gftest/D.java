import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D extends Actor
{
    /**
     * Act - do whatever the D wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(-180);
        move(1);
}
    }    
}
