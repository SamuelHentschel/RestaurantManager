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
    private int current;

    //Constructors
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
            + "----------------------------------------------------------\n"
            + "                 TOTAL:\t\t" + String.format("%4.2f", total()) + "\n"
            + "----------------------------------------------------------\n";
        return str;
    }

}
