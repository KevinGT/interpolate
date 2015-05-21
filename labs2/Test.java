
/**
 * The class test is written in order to test the interpolate method from the LinearIntopolator Class
 * 
 * @author - Kevin Talbot
 * @version (version 1.0 - 21st May 2015)
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
        LinearInterpolator linIntrpA = new LinearInterpolator();
        LinearInterpolator linIntrpB = new LinearInterpolator();
    }
    
    /*
     * Test method for interpolate method in class LinearInterpolator
     */    
    public float interpolationTest(float interpParam)
    {
        float value;
        linIntrpB.interpolate(interpParam);
        value = linIntrpB.getInbetween();
        return value;
    }
    
    /*
     * Create a new public method and call it referenceTest, it should return void and it should take a 
     * float parameter called interParam.
     * 
     * In the implementation assign linIterpA into linIterpB. Call the interpolator method in linIterpB and 
     * then use the command System.out.println(...) to print the value of the inbetween field in linInterpB. 
     * The dots in System.out.println(...) indicates where you should put the call of the accessor method 
     * for the inbetween field. Print also the value of inbetween in linInterpA.
     */    
    public void referenceTest(float interParam)
    {     
        LinearInterpolator linIntrpA = linIntrpB; // assign linIterpA into linIterpB
        linIntrpB.interpolate(interParam); // Call the interpolator method in linIterpB
        System.out.println(linIntrpB.getInbetween()); // then use the command System.out.println(...) to print the value of the inbetween field in linInterpB.
        // The dots in System.out.println(...) indicates where you should put the call of the accessor method for the inbetween field.
        System.out.println(linIntrpA.getInbetween()); // Print also the value of inbetween in linInterpA.
    }
}
