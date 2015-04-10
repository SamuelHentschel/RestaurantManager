package cs2114.restaurantmanager;

import student.TestCase;
import sofia.graphics.Color;

/**
 *  A suite of test methods to test the behavior of the ProcessColor class.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 27, 2015
 */
public class ProcessColorTest
    extends TestCase
{
    //Fields
    //Constructors
    /**
     * An empty constructor to reduce errors.
     */
    public ProcessColorTest()
    {
      //Empty Constructor
    }

    //SetUp
    public void setUp()
    {
        //Empty setup
    }

    //Methods
    /**
     * Tests that the variables that dictate the points in the process are
     * associate with the correct color.
     */
    public void testColors()
    {
        assertEquals(ProcessColor.BUS, Color.gray);
        assertEquals(ProcessColor.CLEAR, Color.white);
        assertEquals(ProcessColor.COOKED, Color.red);
        assertEquals(ProcessColor.COOKING, Color.orange);
        assertEquals(ProcessColor.DELIVERED, Color.green);
        assertEquals(ProcessColor.ORDERED, Color.blue);
        assertEquals(ProcessColor.SEATED, Color.yellow);
    }
}
