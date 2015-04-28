package cs2114.restaurantmanager;

import student.TestCase;

/**
 *  A suite of test methods to test the behavior of the Bill class.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.03.26
 */
public class FoodItemTest
    extends TestCase
{
    //Fields
    private FoodItem item;

    //Constructor
    /**
     * An empty constructor to reduce errors.
     */
    public FoodItemTest()
    {
        //Empty Constructor
    }

    //SetUp
    /**
     * Sets up the initial environment used in the test methods.
     */
    public void setUp()
    {
        item = new FoodItem();
    }

    //Methods
    /**
     * Tests the behavior of the getName() method and setting it through the
     * variable.
     */
    public void testGetAndSetName()
    {
        assertEquals(null, item.getName());
        item.name = "item1";
        assertEquals("item1", item.getName());
    }

    /**
     * Tests the behavior of the getIngredients() method and setting it through
     * the variable.
     */
    public void testGetAndSetIngredients()
    {
        assertEquals(null, item.getIngredients());
        item.ingredients = "ing1 ing2 ing3 ing4";
        assertEquals("ing1 ing2 ing3 ing4", item.getIngredients());
    }

    /**
     * Tests the behavior of the getCost() method and setting it through the
     * variable.
     */
    public void testGetAndSetCost()
    {
        assertEquals(0.00, item.getCost(), 0.01);
        item.cost = 3.00;
        assertEquals(3.00, item.getCost(), 0.001);
    }

    /**
     * Tests the behavior of the getNote() method and setNote() method.
     */
    public void testGetAndSetNote()
    {
        assertEquals(null, item.getNote());
        item.setNote("String1");
        assertEquals("String1", item.getNote());
        item.setNote("String2");
        assertEquals("String2", item.getNote());
    }

    /**
     * Tests the behavior of the getTimeOrdered() and setTimeOrdered() methods.
     */
    public void testGetAndSetTimeOrdered()
    {
        assertEquals(0, item.getTimeOrdered(), 1);
        item.setTimeOrdered();
        assertEquals(System.currentTimeMillis(), item.getTimeOrdered(), 1);
    }

    /**
     * Tests the behavior of the getTimeStartedCooking() and
     * setTimeStartedCooking() methods.
     */
    public void testGetAndSetTimeStartedCooking()
    {
        assertEquals(0, item.getTimeStartedCooking(), 1);
        item.setTimeStartedCooking();
        assertEquals(System.currentTimeMillis(),
            item.getTimeStartedCooking(), 1);
    }

    /**
     * Tests the behavior of the getTimeFinishedCooking() and
     * setTimeFinishedCooking() methods.
     */
    public void testGetAndSetTimeFinishedCooking()
    {
        assertEquals(0, item.getTimeFinishedCooking(), 1);
        item.setTimeFinishedCooking();
        assertEquals(System.currentTimeMillis(),
            item.getTimeFinishedCooking(), 1);
    }

    /**
     * Tests the behavior of the getTimeDelivered() and setTimeDelivered()
     * methods.
     */
    public void testGetAndSetTimeDelivered()
    {
        assertEquals(0, item.getTimeDelivered(), 1);
        item.setTimeDelivered();
        assertEquals(System.currentTimeMillis(),
            item.getTimeDelivered(), 1);
    }

    /**
     * Tests the behavior of the toString() method.
     */
    public void testToString()
    {
        item.name = "item1";
        item.cost = 1.00;
        item.ingredients = "ingredients1";
        item.setNote("Note1");
        assertEquals("item1\t1.00\nIngredients: ingredients1\nNotes:\tNote1",
            item.toString());
    }
}