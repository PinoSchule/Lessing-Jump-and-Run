/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer 

{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Timer
     */
    public Timer()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void act()
    { 
int timer = 0;
timer++;
if(timer <= 10000)
{
if(Coins <= 100)
{
new Win();
}
else
{
new Lose();
}
}
}
    }
