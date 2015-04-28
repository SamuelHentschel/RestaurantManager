package cs2114.restaurantmanager;


import android.widget.*;
import android.content.Intent;

// -------------------------------------------------------------------------
/**
 *  Test class for BillScreen class
 *
 *  @author Zheng Wang (zhengw8)
 *  @version 2015.04.27
 */
public class BillScreenTests
    extends student.AndroidTestCase<BillScreen>
{
    // ~ Fields ................................................................

    private TextView billView;
    private Button  paidBill;
    private Button  billToTable;
    private Restaurant restaurant;


    // ----------------------------------------------------------
    /**
     * Test cases that extend AndroidTestCase must have a parameterless
     * constructor that calls super() and passes it the screen/activity class
     * being tested.
     */
    public BillScreenTests()
    {
        super(BillScreen.class);
    }

    // ~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Initializes the buttons and text fixtures.
     */
    public void setUp()
    {
        restaurant = new Restaurant();
    }


    // ----------------------------------------------------------
    /**
     * Test Method for billToTable button
     */
    public void testBillToTable()
    {
        assertTrue(billToTable.isClickable());
    }

    // ----------------------------------------------------------
    /**
     * Test Method for billView display
     */
    public void testBillView()
    {
        assertEquals("Large Text", billView.getText());

    }

    public void testPaidBill()
    {
        assertTrue(billToTable.isClickable());
    }


}
