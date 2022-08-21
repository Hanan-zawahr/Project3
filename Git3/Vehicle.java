import java.awt.Color;

/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends Automobile
{
    // instance variables - replace the example below with your own
    private int x;
    public int length; 
    public int  width;
    public Color Color;
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        // initialise instance variables
        x = 0;

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
