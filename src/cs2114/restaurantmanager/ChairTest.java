package cs2114.restaurantmanager;

import student.TestCase;

/**
 *  A suite of test methods to test the behavior of the Chair class.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2014.04.27
 */
public class ChairTest
    extends TestCase
{
    //Fields
    private Chair chair;
    private FoodItem item1;
    private FoodItem item2;
    private FoodItem item3;
    private FoodItem item4;
    private FoodItem item5;
    private FoodItem item6;
    private FoodItem item7;
    private FoodItem item8;
    private FoodItem item9;
    private FoodItem item10;
    private FoodItem item11;

    //Constructor
    /**
     * An empty constructor to reduce errors.
     */
    public ChairTest()
    {
        //Empty Constructor
    }

    //SetUp
    /**
     * Sets up the initial test conditions needed for all the test methods.
     */
    public void setUp()
    {
        chair = new Chair(1);
        item1 = new FoodItem();
        item2 = new FoodItem();
        item3 = new FoodItem();
        item4 = new FoodItem();
        item5 = new FoodItem();
        item6 = new FoodItem();
        item7 = new FoodItem();
        item8 = new FoodItem();
        item9 = new FoodItem();
        item10 = new FoodItem();
        item11 = new FoodItem();
        item1.name = "item1";
        item2.name = "item2";
        item3.name = "item3";
        item4.name = "item4";
        item5.name = "item5";
        item6.name = "item6";
        item7.name = "item7";
        item8.name = "item8";
        item9.name = "item9";
        item10.name = "item10";
        item11.name = "item11";
    }

    //Methods
    /**
     * Tests the behavior of the getOrders() and add() methods.
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

        chair.add(item3);
        assertEquals(3, chair.getSize());
        assertEquals("item3", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item4);
        assertEquals(4, chair.getSize());
        assertEquals("item4", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item5);
        assertEquals(5, chair.getSize());
        assertEquals("item5", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item6);
        assertEquals(6, chair.getSize());
        assertEquals("item6", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item7);
        assertEquals(7, chair.getSize());
        assertEquals("item7", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item8);
        assertEquals(8, chair.getSize());
        assertEquals("item8", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item9);
        assertEquals(9, chair.getSize());
        assertEquals("item9", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item10);
        assertEquals(10, chair.getSize());
        assertEquals("item10", chair.getOrders()[chair.getSize() - 1].name);

        chair.add(item11);
        assertEquals(11, chair.getSize());
        assertEquals("item11", chair.getOrders()[chair.getSize() - 1].name);
    }
}