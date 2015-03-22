package cs2114.restaurantmanager;

/**
 *  Creates a new chair which holds the specific orders of that chair.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 22, 2015
 */
class Chair
{
    private FoodItem[] orders;

    /**
     * Creates a new chair object with the specified space for orers.
     */
    public Chair()
    {
        orders = new FoodItem[10];
    }

    /**
     * Gets the array of FoodItems (orders).
     *
     * @return      Returns the array used to hold the person's orders.
     */
    public FoodItem[] getOrders()
    {
        return orders;
    }
}
