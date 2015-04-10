package cs2114.restaurantmanager;

/**
 *  Creates a bill for the customer at the restaurant.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 25, 2015
 */
class Bill
{
    //Fields
    private FoodItem[] orders;
    private final static double localTax = 0.06;
    private final static double stateTax = 0.053;
    private double subtotal = 0;
    private double total = 0;

    //Constructors
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
            sum = sum + item.getCost();
        }
        subtotal = sum;
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
        sum = sum + (sum * (stateTax + localTax));
        total = sum;
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
     * Gets the cost of just the food items consumed.
     *
     * @return      Returns the subtotal of the Bill.
     */
    public double getSubtotal()
    {
        return subtotal;
    }

    /**
     * Gets the cost of all FoodItems consumed with tax included.
     *
     * @return      Returns the total of the Bill.
     */
    public double getTotal()
    {
        return total;
    }

    public String toString()
    {
        String str = "              BILL\n"
            + "//////////------------///////////\n";
        for(FoodItem item: orders)
        {
            str = str + item.getName() + "\n\t" + String.format("%.2f", item.getCost()) + "\n";
        }
        str = str + "----------------------------------\n"
            + "         SUBTOTAL\t" + String.format("%.2f", subtotal()) + "\n"
            + "----------------------------------\n"
            + "         TOTAL\t" + String.format("%.2f", total()) + "\n"
            + "----------------------------------\n";
        return str;
    }
}
