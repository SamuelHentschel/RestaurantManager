package cs2114.restaurantmanager;

import student.TestCase;

/**
 *  A suite of test methods to test the behavior of the Table class.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 27, 2015
 */
public class TableTest
    extends TestCase
{
    //Fields
    private Table tableSetChairs;
    private Table table;
    private FoodItem item;

    //Constructor
    /**
     * An empty constructor to reduce errors.
     */
    public TableTest()
    {
      //Empty Constructor
    }

    //SetUp
    public void setUp()
    {
        tableSetChairs = new Table(3);
        table = new Table();
        item = new FoodItem();
        item.name = "item1";
    }

    //Methods
    /**
     * Tests the behavior of the getNumChairs() method.
     */
    public void testGetNumChairs()
    {
        assertEquals(3, tableSetChairs.getNumChairs());
        assertEquals(4, table.getNumChairs());
    }

    /**
     * Tests the behavior of the getChairs() method.
     */
    public void testGetChairs()
    {
        assertEquals(0, table.getChairs()[0].getSize());
        table.getChairs()[0].add(item);
        assertEquals("item1", table.getChairs()[0].getOrders()[0].name);
    }
}
