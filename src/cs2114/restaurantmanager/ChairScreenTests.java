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

    public ChairScreenTests()
    {
        super(ChairScreen.class);
    }


    public void setUp()
    {
        restaurant = new Restaurant();
    }

    public void testChairToTable()
    {
        assertTrue(chairToTable.isClickable());
    }



}
