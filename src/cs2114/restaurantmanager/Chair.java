package cs2114.restaurantmanager;

import java.util.ArrayList;

/**
 *  Create a new Chair which holds the specific orders of a specific customer.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 25, 2015
 */
class Chair
{
    //Fields
    private ArrayList<FoodItem> orders;

    //Constructors
    /**
     * Creates a new Chair with the default number of 10 orders.
     */
    public Chair()
    {
        orders = new ArrayList<FoodItem>();
    }

    /**
     * Get the array of FoodItems (orders).
     *
     * @return      Returns the array used to hold the person's orders.
     */
    public ArrayList<FoodItem> getOrders()
    {
        return orders;
    }
}
