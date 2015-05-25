
/**
 * The LinearInterpolator Class is written as an example class demonstrating instance variables,
 * the constructor, accessor(getter) and mutator(setter) methods, and finally the interpolation
 * method in order to change the value of variabl inbetween.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinearInterpolator
{
    // instance variables - replace the example below with your own
    public float start;
    public float inbetween;
    public float end;

    /**
     * Constructor for objects of class LinearInterpolator
     * This is a comment added by Kevin
     */
    public LinearInterpolator()
    {
        // initialise instance variables
        start = 0;
        end = 100;
        inbetween = 0;
    }

    /*
     * this is a accessor method (getter) that return the start field
     */
    public float getStart()
    {
       return start; 
    }
        
    /*
     * this is a accessor method (getter) that return the inbetween field
     */
    public float getInbetween()
    {
        return inbetween;
    }
        
     /*
     * this is a accessor method (setter) that return the end field
     */
    public float getEnd()
    {
        return end;
    }    
    
     /*
     * this is a mutator method (setter) setting the value of start
     */
    public void setStart(float start)
    {
        if(start > end)
        {
            System.out.println("Error: Start cannot be larger than End");
        } else {
            this.start = start;
        }
    }
    
     /*
     * this is a mutator method (setter) setting the value of end
     */
    public void setEnd(float end)
    {
        if(end < start)
        {
            System.out.println("Error: End cannot be smaller than Start");
        } else {
            this.end = end;
        }
    }  
    
     /*
     * this method creates the variable of inbetween
     */
    public void interpolate(float interpParam)
    {
        if (interpParam < 0 || interpParam > 1)
        {
            System.out.println("Error: interpParam must be a value between 0 and 1");
        } else {
            float product = end * interpParam;
            inbetween = product + start;
        }
    }
}
