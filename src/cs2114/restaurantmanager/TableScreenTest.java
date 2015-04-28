package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.content.Intent;
import android.widget.Button;
import junit.framework.TestCase;

/**
 *  A suite of test methods to test the behavior of the TableScreen
 *  class.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.04.27
 */
public class TableScreenTest
    extends student.AndroidTestCase<TableScreen>
{
    //Fields
    private Button tableToServer;
    private Button chair1;
    private Button chair2;
    private Button chair3;
    private Button chair4;
    private Button chair5;
    private Button chair6;
    private static Restaurant rest;
    private HotDog hotdog;
    private Button showBill;

    /**
     * Initializes the restaurant field
     */
    public void setUp()
    {
        rest = new Restaurant();
    }
    /**
     * Initializes the table screen that we will test in.
     */
    public TableScreenTest()
    {
        super(TableScreen.class);
    }
    /**
     * Tests the function of the tableToServer button.
     */
    public void testTableToServer()
    {
        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(tableToServer);
        assertNotNull(rest.getTables()[0]);
    }
    /**
     * Test the function of the chair1 button and what the color
     * it is when the times of order, deliver, etc are set
     * for that order.
     */
    public void testChair1()
    {
        assertEquals(chair1.getDrawingCacheBackgroundColor(),
            ProcessColor.CLEAR);

        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(chair1);
        assertEquals(chair1.getDrawingCacheBackgroundColor(),
            ProcessColor.SEATED);

        rest.getTables()[0].getChairs()[0].add(hotdog);
        assertNotNull(rest.getTables()[0].getChairs()[0]);
        assertEquals(chair1.getDrawingCacheBackgroundColor(),
            ProcessColor.ORDERED);

        rest.getTables()[0].getChairs()[0].getOrders()[0].
        setTimeStartedCooking();
        assertEquals(chair1.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKING);

        rest.getTables()[0].getChairs()[0].getOrders()[0].
        setTimeFinishedCooking();
        assertEquals(chair1.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKED);

        rest.getTables()[0].getChairs()[0].getOrders()[0].
        setTimeDelivered();
        assertEquals(chair1.getDrawingCacheBackgroundColor(),
            ProcessColor.DELIVERED);
    }
    /**
     * Test the function of the chair2 button and what the color
     * it is when the times of order, deliver, etc are set
     * for that order.
     */
    public void testChair2()
    {
        assertEquals(chair2.getDrawingCacheBackgroundColor(),
            ProcessColor.CLEAR);

        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(chair2);
        assertEquals(chair2.getDrawingCacheBackgroundColor(),
            ProcessColor.SEATED);

        rest.getTables()[0].getChairs()[1].add(hotdog);
        assertNotNull(rest.getTables()[0].getChairs()[1]);
        assertEquals(chair2.getDrawingCacheBackgroundColor(),
            ProcessColor.ORDERED);

        rest.getTables()[0].getChairs()[1].getOrders()[0].
        setTimeStartedCooking();
        assertEquals(chair2.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKING);

        rest.getTables()[0].getChairs()[1].getOrders()[0].
        setTimeFinishedCooking();
        assertEquals(chair2.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKED);

        rest.getTables()[0].getChairs()[1].getOrders()[0].
        setTimeDelivered();
        assertEquals(chair2.getDrawingCacheBackgroundColor(),
            ProcessColor.DELIVERED);

    }
    /**
     * Test the function of the chair3 button and what the color
     * it is when the times of order, deliver, etc are set
     * for that order.
     */
    public void testChair3()
    {
        assertEquals(chair3.getDrawingCacheBackgroundColor(),
            ProcessColor.CLEAR);

        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(chair3);
        assertEquals(chair3.getDrawingCacheBackgroundColor(),
            ProcessColor.SEATED);

        rest.getTables()[0].getChairs()[2].add(hotdog);
        assertNotNull(rest.getTables()[0].getChairs()[2]);
        assertEquals(chair3.getDrawingCacheBackgroundColor(),
            ProcessColor.ORDERED);

        rest.getTables()[0].getChairs()[2].getOrders()[0].
        setTimeStartedCooking();
        assertEquals(chair3.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKING);

        rest.getTables()[0].getChairs()[2].getOrders()[0].
        setTimeFinishedCooking();
        assertEquals(chair3.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKED);

        rest.getTables()[0].getChairs()[2].getOrders()[0].
        setTimeDelivered();
        assertEquals(chair3.getDrawingCacheBackgroundColor(),
            ProcessColor.DELIVERED);
    }
    /**
     * Test the function of the chair4 button and what the color
     * it is when the times of order, deliver, etc are set
     * for that order.
     */
    public void testChair4()
    {
        assertEquals(chair4.getDrawingCacheBackgroundColor(),
            ProcessColor.CLEAR);

        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(chair4);
        assertEquals(chair4.getDrawingCacheBackgroundColor(),
            ProcessColor.SEATED);

        rest.getTables()[0].getChairs()[3].add(hotdog);
        assertNotNull(rest.getTables()[0].getChairs()[3]);
        assertEquals(chair4.getDrawingCacheBackgroundColor(),
            ProcessColor.ORDERED);

        rest.getTables()[0].getChairs()[3].getOrders()[0].
        setTimeStartedCooking();
        assertEquals(chair4.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKING);

        rest.getTables()[0].getChairs()[3].getOrders()[0].
        setTimeFinishedCooking();
        assertEquals(chair4.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKED);

        rest.getTables()[0].getChairs()[3].getOrders()[0].
        setTimeDelivered();
        assertEquals(chair4.getDrawingCacheBackgroundColor(),
            ProcessColor.DELIVERED);
    }
    /**
     * Test the function of the chair5 buttonand what the color
     * it is when the times of order, deliver, etc are set
     * for that order.
     */
    public void testChair5()
    {
        assertEquals(chair5.getDrawingCacheBackgroundColor(),
            ProcessColor.CLEAR);

        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(chair5);
        assertEquals(chair5.getDrawingCacheBackgroundColor(),
            ProcessColor.SEATED);

        rest.getTables()[0].getChairs()[4].add(hotdog);
        assertNotNull(rest.getTables()[0].getChairs()[4]);
        assertEquals(chair5.getDrawingCacheBackgroundColor(),
            ProcessColor.ORDERED);

        rest.getTables()[0].getChairs()[4].getOrders()[0].
        setTimeStartedCooking();
        assertEquals(chair5.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKING);

        rest.getTables()[0].getChairs()[4].getOrders()[0].
        setTimeFinishedCooking();
        assertEquals(chair5.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKED);

        rest.getTables()[0].getChairs()[4].getOrders()[0].
        setTimeDelivered();
        assertEquals(chair5.getDrawingCacheBackgroundColor(),
            ProcessColor.DELIVERED);
    }
    /**
     * Test the function of the chair6 button and what the color
     * it is when the times of order, deliver, etc are set
     * for that order.
     */
    public void testChair6()
    {
        assertEquals(chair6.getDrawingCacheBackgroundColor(),
            ProcessColor.CLEAR);

        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(chair6);
        assertEquals(chair6.getDrawingCacheBackgroundColor(),
            ProcessColor.SEATED);

        rest.getTables()[0].getChairs()[5].add(hotdog);
        assertNotNull(rest.getTables()[0].getChairs()[5]);
        assertEquals(chair6.getDrawingCacheBackgroundColor(),
            ProcessColor.ORDERED);

        rest.getTables()[0].getChairs()[5].getOrders()[0].
        setTimeStartedCooking();
        assertEquals(chair6.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKING);

        rest.getTables()[0].getChairs()[5].getOrders()[0].
        setTimeFinishedCooking();
        assertEquals(chair6.getDrawingCacheBackgroundColor(),
            ProcessColor.COOKED);

        rest.getTables()[0].getChairs()[5].getOrders()[0].
        setTimeDelivered();
        assertEquals(chair6.getDrawingCacheBackgroundColor(),
            ProcessColor.DELIVERED);
    }
    /**
     * Test the function of the showBill button
     */
    public void testShowBill()
    {
        prepareForUpcomingActivity(Intent.ACTION_VIEW);
        click(showBill);
    }
}
