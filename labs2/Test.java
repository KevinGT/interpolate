
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private LinearInterpolator linIntrpA;
    private LinearInterpolator linIntrpB;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        linIntrpA = new LinearInterpolator();
        linIntrpB = new LinearInterpolator();
    }
    
    public float interpolationTest(float interpParam)
    {
        float value;
        linIntrpB.interpolate(interpParam);
        value = linIntrpB.getInbetween();
        return value;
    }
    
}
