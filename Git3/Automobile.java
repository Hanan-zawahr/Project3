import java.util.Date;

/**
 * Write a description of class Automobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Automobile
{
    // instance variables - replace the example below with your own
    private int x;
    public String ManufactureCompany;
    public Date ManufactureDate;
    public String Model;
    public int plate_num;
    private int body_serail_num;

    /**
     * Constructor for objects of class Automobile
     */
    public Automobile()
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
