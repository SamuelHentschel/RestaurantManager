package cs2114.restaurantmanager;

import android.widget.*;
import android.content.Intent;

// -------------------------------------------------------------------------
/**
 *  Test Class for ChairScreen class
 *
 *  @author
 *  @version Apr 27, 2015
 */
public class ChairScreenTests
    extends student.AndroidTestCase<ChairScreen>
{

    private Restaurant restaurant;
    private Button chairToTable;
    private Spinner foodSpinner;

    // ----------------------------------------------------------
    /**
     * Create a new ChairScreenTests object.
     */
    public ChairScreenTests()
    {
        super(ChairScreen.class);
    }


    public void setUp()
    {
        restaurant = new Restaurant();
    }

    // ----------------------------------------------------------
    /**
     * Test Method for
     */
    public void testChairToTable()
    {
        assertTrue(chairToTable.isClickable());
    }



}
