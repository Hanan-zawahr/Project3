import java.util.Date;

/**
 * Write a description of class Engin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Engin extends Automobile
{
    // instance variables - replace the example below with your own
    private int x;
    public String Manufacture;
    public Date ManufactureDate;
    public String Model;
    public int Capacity;
    public int Cylinders;

    /**
     * Constructor for objects of class Engin
     */
    public Engin()
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
