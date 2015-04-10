package cs2114.restaurantmanager;

import student.TestCase;

/**
 *  A suite of test methods to test the behavior of the Chair class.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 26, 2015
 */
public class ChairTest
    extends TestCase
{
    //Fields
    private Chair chair;
    private FoodItem item1;
    private FoodItem item2;

    //Constructor
    /**
     * An empty constructor to reduce errors.
     */
    public ChairTest()
    {
        //Empty Constructor
    }

    //SetUp
    public void setUp()
    {
        chair = new Chair();
        item1 = new FoodItem();
        item2 = new FoodItem();
        item1.name = "item1";
        item2.name = "item2";
    }

    //Methods
    /**
     * Tests the behavior of the getOrders() method.
     */
    public void testGetAndSetOrders()
    {
        assertEquals(0, chair.getSize());
        chair.add(item1);
        assertEquals(1, chair.getSize());
        assertEquals("item1", chair.getOrders()[chair.getSize() - 1].name);
        chair.add(item2);
        assertEquals(2, chair.getSize());
        assertEquals("item2", chair.getOrders()[chair.getSize() - 1].name);
    }
}