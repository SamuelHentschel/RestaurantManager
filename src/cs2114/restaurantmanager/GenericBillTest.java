package cs2114.restaurantmanager;

import student.TestCase;

/**
 *  A suite of test methods to test the behavior of the Bill class for the
 *  FoodItem class.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 26, 2015
 */
public class GenericBillTest
    extends TestCase
{
    //Fields for generic FoodItems
    private FoodItem item1 = new FoodItem();
    private FoodItem item2 = new FoodItem();
    private FoodItem item3 = new FoodItem();
    private FoodItem item4 = new FoodItem();
    private FoodItem[] fooditems = {item1, item2, item3, item4};
    private Bill bill = new Bill(fooditems);

    //Constructor
    /**
     * An empty constructor to reduce errors.
     */
    public GenericBillTest()
    {
        //Leave empty as the BillTest does not need to be made.
    }

    //SetUp
    public void setUp()
    {
        item1.name = "item1";
        item1.ingredients = "ingredients1";
        item1.cost = 1;
        item2.name = "item2";
        item2.ingredients = "ingredients2";
        item2.cost = 2;
        item3.name = "item3";
        item3.ingredients = "ingredients3";
        item3.cost = 3;
        item4.name = "item4";
        item4.ingredients = "ingredients4";
        item4.cost = 4;
    }

    //Methods for generic FoodItems
    /**
     * Tests the behavior of the subtotal() method for generic FoodItems.
     */
    public void testSubtotalAndGetSubtotal()
    {
        assertEquals(10.0, bill.subtotal(), 0.001);
    }

    /**
     * Tests the behavior of the total() method for generic FoodItems.
     */
    public void testTotalAndGetTotal()
    {
        assertEquals(11.13, bill.total(), 0.001);
    }

    /**
     * Tests the behavior of the getOrders() method for generic FoodItems.
     */
    public void testGetOrders()
    {
        assertEquals(4, bill.getOrders().length);
        assertEquals(FoodItem.class, bill.getOrders()[0].getClass());
        assertEquals(FoodItem.class, bill.getOrders()[1].getClass());
        assertEquals(FoodItem.class, bill.getOrders()[2].getClass());
        assertEquals(FoodItem.class, bill.getOrders()[3].getClass());
        assertEquals("item1", bill.getOrders()[0].getName());
        assertEquals("item2", bill.getOrders()[1].getName());
        assertEquals("item3", bill.getOrders()[2].getName());
        assertEquals("item4", bill.getOrders()[3].getName());
        assertEquals(1, bill.getOrders()[0].getCost(), 0.001);
        assertEquals(2, bill.getOrders()[1].getCost(), 0.001);
        assertEquals(3, bill.getOrders()[2].getCost(), 0.001);
        assertEquals(4, bill.getOrders()[3].getCost(), 0.001);
        assertEquals("ingredients1", bill.getOrders()[0].getIngredients());
        assertEquals("ingredients2", bill.getOrders()[1].getIngredients());
        assertEquals("ingredients3", bill.getOrders()[2].getIngredients());
        assertEquals("ingredients4", bill.getOrders()[3].getIngredients());
    }

    /**
     * Tests the behavior of the toString() method for generic FoodItems.
     */
    public void testToString()
    {
        assertEquals("              BILL\n//////////------------///////////\n"
            + "item1\n\t1.00\nitem2\n\t2.00\nitem3\n\t3.00\nitem4\n\t4.00\n"
            + "----------------------------------\n         SUBTOTAL\t10.00\n"
            + "----------------------------------\n         TOTAL\t11.13\n"
            + "----------------------------------\n", bill.toString());
    }
}