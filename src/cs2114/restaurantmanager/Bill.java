package cs2114.restaurantmanager;

/**
 *  Creates a bill for the customer at the restaurant.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 22, 2015
 */
class Bill
{
    private FoodItem[] orders;
    private final static double localTax = 0.06;
    private final static double stateTax = 0.053;
    private double subtotal = subtotal();
    private double total = total();

    /**
     * Creates a new bill object that holds all the data bout financial aspect
     * of the meal.
     *
     * @param items     The list of food items which are to be included in this
     *                  bill.
     */
    public Bill(FoodItem[] items)
    {
        orders = items;
    }

    /**
     * Totals the cost of all the items eaten and drank.
     *
     * @return      Returns the subtotal of the bill.
     */
    public double subtotal()
    {
        double sum = 0;
        for (FoodItem item: orders)
        {
            sum = sum + item.getCost();
        }
        return sum;
    }

    /**
     * Totals the cost of subtotal with tax included.
     *
     * @return      Returns the total of the bill.
     */
    public double total()
    {
        double sum = subtotal;
        sum = sum + (sum * (stateTax + localTax));
        return sum;
    }

    /**
     * Gets all the orders that are being put on this bill.
     *
     * @return      Returns all the food items being purchased on this bill.
     */
    public FoodItem[] getOrders()
    {
        return orders;
    }

    /**
     * Gets the cost of just the food items consumed.
     *
     * @return      Returns the subtotal of the bill.
     */
    public double getSubtotal()
    {
        return subtotal;
    }

    /**
     * Gets the cost of all food items consumed with tax included.
     *
     * @return      Returns the total of the bill.
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
            str = str + item.getName() + "\n\t" + item.getCost() + "\n";
        }
        str = str + "----------------------------------\n"
                  + "         SUBTOTAL\t" + subtotal + "\n"
                  + "----------------------------------\n"
                  + "         TOTAL\t" + total + "\n"
                  + "----------------------------------\n";
        return str;
    }
}
