package cs2114.restaurantmanager;

import student.TestCase;

/**
 *  A suite of test methods to test the behavior of the Bill class for the
 *  subclasses of FoodItem.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.26
 */
public class BillTest
    extends TestCase
{
    private BBQChickenPizza pizza;
    private BLT blt;
    private ChickenParmesan chickenparm;
    private CocaCola coke;
    private Coffee coffee;
    private Hamburger hamburger;
    private HotDog hotdog;
    private IcedTea tea;
    private LemonZestChicken chicken;
    private Quesadilla queso;
    private Salmon salmon;
    private Sprite sprite;
    private StirFriedBeef beef;
    private Water water;
    private ZucchiniSquash zucchini;

    /**
     * Empty constructor.
     */
    public BillTest()
    {
        //Empty Constructor
    }

    /**
     * Sets up the test conditions for each test.
     */
    public void setUp()
    {
        pizza = new BBQChickenPizza();
        blt = new BLT();
        chickenparm = new ChickenParmesan();
        coke = new CocaCola();
        coffee = new Coffee();
        hamburger = new Hamburger();
        hotdog = new HotDog();
        tea = new IcedTea();
        chicken = new LemonZestChicken();
        queso = new Quesadilla();
        salmon = new Salmon();
        sprite = new Sprite();
        beef = new StirFriedBeef();
        water = new Water();
        zucchini = new ZucchiniSquash();
    }

    //Subtotal and Total tests
    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * BBQChickenPizza class.
     */
    public void testSubtotalTotalBBQChickenPizza()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = pizza;
        Bill bill = new Bill(items);
        assertEquals(12.99, bill.subtotal(), 0.01);
        assertEquals(14.46, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * BLT class.
     */
    public void testSubtotalTotalBLT()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = blt;
        Bill bill = new Bill(items);
        assertEquals(4.99, bill.subtotal(), 0.01);
        assertEquals(5.55, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * ChickenParmesan class.
     */
    public void testSubtotalTotalChickenParmesan()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = chickenparm;
        Bill bill = new Bill(items);
        assertEquals(14.99, bill.subtotal(), 0.01);
        assertEquals(16.68, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * CocaCola class.
     */
    public void testSubtotalTotalCocaCola()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = coke;
        Bill bill = new Bill(items);
        assertEquals(1.49, bill.subtotal(), 0.01);
        assertEquals(1.66, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * Coffee class.
     */
    public void testSubtotalTotalCoffee()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = coffee;
        Bill bill = new Bill(items);
        assertEquals(1.49, bill.subtotal(), 0.01);
        assertEquals(1.66, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * Hamburger class.
     */
    public void testSubtotalTotalHamburger()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = hamburger;
        Bill bill = new Bill(items);
        assertEquals(4.99, bill.subtotal(), 0.01);
        assertEquals(5.55, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * HotDog class.
     */
    public void testSubtotalTotalHotDog()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = hotdog;
        Bill bill = new Bill(items);
        assertEquals(2.99, bill.subtotal(), 0.01);
        assertEquals(3.33, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * IcedTea class.
     */
    public void testSubtotalTotalIcedTea()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = tea;
        Bill bill = new Bill(items);
        assertEquals(1.49, bill.subtotal(), 0.01);
        assertEquals(1.66, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * LemonZestChicken class.
     */
    public void testSubtotalTotalLemonZestChicken()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = chicken;
        Bill bill = new Bill(items);
        assertEquals(19.99, bill.subtotal(), 0.01);
        assertEquals(22.25, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * Quesadilla class.
     */
    public void testSubtotalTotalQuesadilla()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = queso;
        Bill bill = new Bill(items);
        assertEquals(5.99, bill.subtotal(), 0.01);
        assertEquals(6.67, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * Salmon class.
     */
    public void testSubtotalTotalSalmon()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = salmon;
        Bill bill = new Bill(items);
        assertEquals(8.99, bill.subtotal(), 0.01);
        assertEquals(10.01, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * Sprite class.
     */
    public void testSubtotalTotalSprite()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = sprite;
        Bill bill = new Bill(items);
        assertEquals(1.49, bill.subtotal(), 0.01);
        assertEquals(1.66, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * StirFriedBeef class.
     */
    public void testSubtotalTotalStirFriedBeef()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = beef;
        Bill bill = new Bill(items);
        assertEquals(11.99, bill.subtotal(), 0.01);
        assertEquals(13.34, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * Water class.
     */
    public void testSubtotalTotalWater()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = water;
        Bill bill = new Bill(items);
        assertEquals(0.00, bill.subtotal(), 0.01);
        assertEquals(0.00, bill.total(), 0.01);
    }

    /**
     * Tests the behavior of the subtotal() and total() methods for the
     * ZucchiniSquash class.
     */
    public void testSubtotalTotalZucchiniSquash()
    {
        FoodItem[] items = new FoodItem[10];
        items[1] = zucchini;
        Bill bill = new Bill(items);
        assertEquals(6.99, bill.subtotal(), 0.01);
        assertEquals(7.78, bill.total(), 0.01);
    }

    //GetOrders and toString() tests
    /**
     * Tests the behavior of the getOrders() and toString methods for one item
     * in the list.
     */
    public void testGetOrdersToStringOne()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t12.99\n"
            + "----------------------------------\n"
            + "         TOTAL\t14.46\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for two items
     * in the list.
     */
    public void testGetOrdersToStringTwo()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t17.98\n"
            + "----------------------------------\n"
            + "         TOTAL\t20.01\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for three
     * items in the list.
     */
    public void testGetOrdersToStringThree()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t32.97\n"
            + "----------------------------------\n"
            + "         TOTAL\t36.70\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for four items
     * in the list.
     */
    public void testGetOrdersToStringFour()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t34.46\n"
            + "----------------------------------\n"
            + "         TOTAL\t38.35\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for five items
     * in the list.
     */
    public void testGetOrdersToStringFive()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t35.95\n"
            + "----------------------------------\n"
            + "         TOTAL\t40.01\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for six items
     * in the list.
     */
    public void testGetOrdersToStringSix()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t40.94\n"
            + "----------------------------------\n"
            + "         TOTAL\t45.57\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for seven
     * items in the list.
     */
    public void testGetOrdersToStringSeven()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t43.93\n"
            + "----------------------------------\n"
            + "         TOTAL\t48.89\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for eight
     * items in the list.
     */
    public void testGetOrdersToStringEight()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t45.42\n"
            + "----------------------------------\n"
            + "         TOTAL\t50.55\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for nine items
     *  in the list.
     */
    public void testGetOrdersToStringNine()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t65.41\n"
            + "----------------------------------\n"
            + "         TOTAL\t72.80\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for ten items
     *  in the list.
     */
    public void testGetOrdersToStringTen()
    {
        FoodItem[] items = new FoodItem[10];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        items[9] = queso;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.getOrders()[9].getName(), "Quesadilla");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "Quesadilla\n\t5.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t71.40\n"
            + "----------------------------------\n"
            + "         TOTAL\t79.47\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for eleven
     * items in the list.
     */
    public void testGetOrdersToStringEleven()
    {
        FoodItem[] items = new FoodItem[20];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        items[9] = queso;
        items[10] = salmon;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.getOrders()[9].getName(), "Quesadilla");
        assertEquals(bill.getOrders()[10].getName(), "Fried Salmon");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "Quesadilla\n\t5.99\n"
            + "Fried Salmon\n\t8.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t80.39\n"
            + "----------------------------------\n"
            + "         TOTAL\t89.47\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for twelve
     * items in the list.
     */
    public void testGetOrdersToStringTwelve()
    {
        FoodItem[] items = new FoodItem[20];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        items[9] = queso;
        items[10] = salmon;
        items[11] = sprite;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.getOrders()[9].getName(), "Quesadilla");
        assertEquals(bill.getOrders()[10].getName(), "Fried Salmon");
        assertEquals(bill.getOrders()[11].getName(), "Sprite");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "Quesadilla\n\t5.99\n"
            + "Fried Salmon\n\t8.99\n"
            + "Sprite\n\t1.49\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t81.88\n"
            + "----------------------------------\n"
            + "         TOTAL\t91.13\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for thirteen
     * items in the list.
     */
    public void testGetOrdersToStringThirteen()
    {
        FoodItem[] items = new FoodItem[20];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        items[9] = queso;
        items[10] = salmon;
        items[11] = sprite;
        items[12] = beef;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.getOrders()[9].getName(), "Quesadilla");
        assertEquals(bill.getOrders()[10].getName(), "Fried Salmon");
        assertEquals(bill.getOrders()[11].getName(), "Sprite");
        assertEquals(bill.getOrders()[12].getName(), "Stir Fried Beef");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "Quesadilla\n\t5.99\n"
            + "Fried Salmon\n\t8.99\n"
            + "Sprite\n\t1.49\n"
            + "Stir Fried Beef\n\t11.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t93.87\n"
            + "----------------------------------\n"
            + "         TOTAL\t104.48\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for fourteen
     * items in the list.
     */
    public void testGetOrdersToStringFourteen()
    {
        FoodItem[] items = new FoodItem[20];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        items[9] = queso;
        items[10] = salmon;
        items[11] = sprite;
        items[12] = beef;
        items[13] = water;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.getOrders()[9].getName(), "Quesadilla");
        assertEquals(bill.getOrders()[10].getName(), "Fried Salmon");
        assertEquals(bill.getOrders()[11].getName(), "Sprite");
        assertEquals(bill.getOrders()[12].getName(), "Stir Fried Beef");
        assertEquals(bill.getOrders()[13].getName(), "Water");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "Quesadilla\n\t5.99\n"
            + "Fried Salmon\n\t8.99\n"
            + "Sprite\n\t1.49\n"
            + "Stir Fried Beef\n\t11.99\n"
            + "Water\n\t0.00\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t93.87\n"
            + "----------------------------------\n"
            + "         TOTAL\t104.48\n"
            + "----------------------------------\n");
    }

    /**
     * Tests the behavior of the getOrders() and toString methods for fifteen
     * items in the list.
     */
    public void testGetOrdersToStringFifteen()
    {
        FoodItem[] items = new FoodItem[20];
        items[0] = pizza;
        items[1] = blt;
        items[2] = chickenparm;
        items[3] = coke;
        items[4] = coffee;
        items[5] = hamburger;
        items[6] = hotdog;
        items[7] = tea;
        items[8] = chicken;
        items[9] = queso;
        items[10] = salmon;
        items[11] = sprite;
        items[12] = beef;
        items[13] = water;
        items[14] = zucchini;
        Bill bill = new Bill(items);
        assertEquals(bill.getOrders()[0].getName(), "BBQ Chicken Pizza");
        assertEquals(bill.getOrders()[1].getName(), "BLT Sandwich");
        assertEquals(bill.getOrders()[2].getName(), "Chicken Parmesan");
        assertEquals(bill.getOrders()[3].getName(), "Coca Cola");
        assertEquals(bill.getOrders()[4].getName(), "Coffee");
        assertEquals(bill.getOrders()[5].getName(), "Hamburger");
        assertEquals(bill.getOrders()[6].getName(), "Hot Dog");
        assertEquals(bill.getOrders()[7].getName(), "Iced Tea");
        assertEquals(bill.getOrders()[8].getName(), "Lemon Zest Chicken");
        assertEquals(bill.getOrders()[9].getName(), "Quesadilla");
        assertEquals(bill.getOrders()[10].getName(), "Fried Salmon");
        assertEquals(bill.getOrders()[11].getName(), "Sprite");
        assertEquals(bill.getOrders()[12].getName(), "Stir Fried Beef");
        assertEquals(bill.getOrders()[13].getName(), "Water");
        assertEquals(bill.getOrders()[14].getName(), "Zucchini and Squash Platter");
        assertEquals(bill.toString(),
            "              BILL\n"
            + "//////////------------///////////\n"
            + "BBQ Chicken Pizza\n\t12.99\n"
            + "BLT Sandwich\n\t4.99\n"
            + "Chicken Parmesan\n\t14.99\n"
            + "Coca Cola\n\t1.49\n"
            + "Coffee\n\t1.49\n"
            + "Hamburger\n\t4.99\n"
            + "Hot Dog\n\t2.99\n"
            + "Iced Tea\n\t1.49\n"
            + "Lemon Zest Chicken\n\t19.99\n"
            + "Quesadilla\n\t5.99\n"
            + "Fried Salmon\n\t8.99\n"
            + "Sprite\n\t1.49\n"
            + "Stir Fried Beef\n\t11.99\n"
            + "Water\n\t0.00\n"
            + "Zucchini and Squash Platter\n\t6.99\n"
            + "----------------------------------\n"
            + "         SUBTOTAL\t100.86\n"
            + "----------------------------------\n"
            + "         TOTAL\t112.26\n"
            + "----------------------------------\n");
    }
}