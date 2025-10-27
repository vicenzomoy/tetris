import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    private static int highscore = 0;
    public GameOver(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(18, 22, 16, false);
        if(highscore < score) highscore = score;
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new Grid());
        }
    }
}
