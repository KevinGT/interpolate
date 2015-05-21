
/**
 * Write a description of class LinearInterpolator here.
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
        float start = 0;
        float end = 100;
        float inbetween = 0;
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
        this.start = start;
    }
    
     /*
     * this is a mutator method (setter) setting the value of end
     */
    public void setEnd(float End)
    {
        this.end = end;
    }  
    
     /*
     * this method creates the variable of inbetween
     */
    public void interpolate(float interpParam)
    {
        float product = end * interpParam;
        inbetween = product + start;
    }
}
