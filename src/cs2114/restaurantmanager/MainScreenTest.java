package cs2114.restaurantmanager;

import android.content.Intent;
import junit.framework.TestCase;
import android.widget.Button;
/**
 *  A suite of test methods to test the behavior of the
 *  MainScreen class.
 *
 *  @author Calogero
 *  @version Apr 27, 2015
 */
public class MainScreenTest
    extends student.AndroidTestCase<MainScreen>
{
    //Fields
    private Restaurant restaurant;
    private Button serversTable;
    private Button cookersList;
    private Button managersData;
    private Button serverToMenu;

    /**
     * Creates the screen being tested
     */
    public MainScreenTest()
    {
        super(MainScreen.class);
    }
    /**
     * Initializes the restaurant being used throughout the
     * application.
     */
    public void setUp()
    {
        restaurant = new Restaurant();
    }
    /**
     * Tests the function of the serversTable button
     */
    public void testServersTable()
    {
        assertTrue(serversTable.isClickable());
    }
    /**
     * Tests the function of the cookersList button
     */
    public void testCookersList()
    {
        assertTrue(cookersList.isClickable());
    }
    /**
     * Tests the function of the managerData button
     */
    public void testManagerData()
    {
        assertFalse(managersData.isEnabled());
    }
}