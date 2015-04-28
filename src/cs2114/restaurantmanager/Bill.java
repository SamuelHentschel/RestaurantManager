package cs2114.restaurantmanager;

/**
 *  Creates a Bill object to be used in billing the Table.
 *  Holds an array of FoodItems ordered by the Table and calculates the subtotal
 *  and the total cost with Virginia State tax.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.27
 */
class Bill
{
    //Fields
    private FoodItem[] orders;
    private final static double localTax = 0.06;
    private final static double stateTax = 0.053;
    private int current;

    //Constructors
    /**
     * Creates a new Bill object.
     * Initializes a new FoodItem array that can hold 10 items and the variable
     * that holds the size of the array.
     */
    public Bill()
    {
        orders = new FoodItem[10];
        current = 0;
    }

    /**
     * Creates a new Bill object that holds all the data about the financial
     * aspect of the meal.
     *
     * @param items     The list of FoodItems which are to be included in this
     *                  bill.
     */
    public Bill(FoodItem[] items)
    {
        orders = items;
        current = items.length;
    }

    /**
     * Totals the cost of all the FoodItems in this Bill.
     *
     * @return      Returns the subtotal used by this Bill.
     */
    public double subtotal()
    {
        double sum = 0;
        for (FoodItem item: orders)
        {
            if (item != null) sum = sum + item.getCost();
        }
        return sum;
    }

    /**
     * Totals the subtotal with tax included.
     *
     * @return      Returns the total used by this Bill.
     */
    public double total()
    {
        double sum  = subtotal();
        sum = sum * (1 + (stateTax + localTax));
        sum = (double)Math.round(sum * 100) / 100;
        return sum;
    }

    /**
     * Gets all the orders that are being put on this Bill.
     *
     * @return      Returns the array holding all the orders on this Bill.
     */
    public FoodItem[] getOrders()
    {
        return orders;
    }

    /**
     * Add more orders (typically from other chair) to this bill
     * @param other items to be added
     */
    public void addToBill(FoodItem other)
    {
        if (current < orders.length)
        {
            orders[current] = other;
            current++;
        }
        else
        {
            FoodItem[] temp = new FoodItem[orders.length * 2];
            for (int count = 0; count < orders.length; count++)
            {
                temp[count] = orders[count];
            }
            orders = temp;
            addToBill(other);
        }
    }

    /**
     * Creates a string representation of the Bill.
     * This is used in the BillScreen when providing a bill for the customers.
     */
    public String toString()
    {
        String str = "                            BILL\n"
            + "////////-------------------------------------/////////\n";
        for(FoodItem item: orders)
        {
            if (item != null)
            {
            str = str + item.getName() + "\n\t\t" + String.format("%.2f",
                item.getCost()) + "\n";
            }
        }
        str = str + "----------------------------------------------------------\n"
            + "----------------------------------------------------------\n"
            + "         SUBTOTAL:\t\t" + String.format("%4.2f", subtotal()) + "\n"
            + "                 TOTAL:\t\t" + String.format("%.2f", total()) + "\n"
            + "----------------------------------------------------------\n";
        return str;
    }
}