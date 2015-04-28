package cs2114.restaurantmanager;

import android.widget.*;
import android.content.Intent;

// -------------------------------------------------------------------------
/**
 *  Test class for CookerScreen class
 *
 *  @author Zheng Wang (zhengw8)
 *  @version 2015.04.27
 */
public class CookerScreenTests
    extends student.AndroidTestCase<CookerScreen>
{

    private Restaurant restaurant;
    private Button cookerToMenu;
    private Button cookButton;
    private Button finishButton;
    private LinearLayout inprocess;
    private LinearLayout todo;
    private HotDog hotdog;

    // ----------------------------------------------------------
    /**
     * Create a new CookerScreenTests object.
     */
    public CookerScreenTests()
    {
        super(CookerScreen.class);
    }

    public void setUp()
    {
        restaurant = new Restaurant();
    }

    // ----------------------------------------------------------
    /**
     * Test Method for cookerToMenu Button
     */
    public void testCookerToMenu()
    {
        assertTrue(cookerToMenu.isClickable());
    }

    // ----------------------------------------------------------
    /**
     * Test Method for cookButton
     */
    public void testCookButton()
    {
        assertTrue(cookButton.isClickable());
    }

    // ----------------------------------------------------------
    /**
     * Test Method for finishButton
     */
    public void testFinishButton()
    {
        assertTrue(finishButton.isClickable());
    }


    // ----------------------------------------------------------
    /**
     * Test Method for todo linear layout
     */
    public void testToDo()
    {


    }

    // ----------------------------------------------------------
    /**
     * Test Method for inprocess linear layout
     */
    public void testinProcess()
    {


    }


}
