import java.util.ArrayList;
import java.util.List;

/**
 * In this project you will learn about writing classes in Java.
 * 
 * You will:
 * 1. Write a traditional class with a class (static) method
 * 
 * 2. Add instance variables, instance methods, and a constructor so that it can be instaniated.
 *  
 * @author (your name) 
 * @version Unit 7 - Writing Object Classes
 */
public class MyRandom
{
    private int from = 1;
    private int to = 10;

    /**
     * Simply return your name as a String, last name then first name, separated by a comma
     *
     * @return your name as a String
     */
    public static String yourName()
    {
        return "Kumagami, Hirotaka"; 
    }

    /**
     * Given two int parameter values, from and to, you will return a random int that falls
     * in the range of from and to (inclusive).
     * 
     * For example:
     *  randomInRange(1,10) would return a number between 1 and 10 inclusive.
     *    Valid return values would be the numbers: 1...10
     *  
     *  randomInRange(10,1) would also return a number between 1 and 10 inclusive.
     *  
     *  randomInRange(-5,5) would return a number between -5 and 5 inclusive.
     *  
     *  NOTE: This method does not work as intended!
     *  
     * @param   from    one bound of the random int to be generated
     * @return  to      the second bound of the random int ot be genrated
     */
    public static int randomInRange(int from, int to)
    {  

        if(from > to)
        {
            return (int)(Math.random() * (from - to + 1)) + to;
        }
        return (int)(Math.random() * (to - from + 1)) + from;

    }

    public MyRandom(int first, int second)
    {
        from = first;
        to = second;
    }

    public int nextRandom() 
    {
        return randomInRange(from, to); 
    }  //runs the first method again
    
    public void setFrom(int setFrom)
    {
        from = setFrom;
    } //simply sets the current "from" number to a place holder
    
    public void setTo(int setTo)
    {
        to = setTo;
    }

    public int getFrom()
    {
        return from;
    }
    //returns the value of the current from
    public int getTo()
    {
        return to;
    }

    public static String getIntVal(double val)
    {
        String vals = val + "";
        int a = vals.indexOf(".");
        String finall = vals.substring(0,a);
        return finall;
    }
}

