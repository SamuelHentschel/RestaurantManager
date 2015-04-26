package cs2114.restaurantmanager;


import sofia.util.*;
/**
 *  Create a new Chair which holds the specific orders of a specific customer.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 25, 2015
 */
class Chair
    extends Observable
{
    //Fields
    private FoodItem[] orders;
    private int current;

    //Constructors
    /**
     * Creates a new Chair with the default number of 10 orders.
     */
    public Chair()
    {
        orders = new FoodItem[10];
        current = 0;
    }

    /**
     * Get the array of FoodItems (orders).
     *
     * @return      Returns the array used to hold the person's orders.
     */
    public FoodItem[] getOrders()
    {
        return orders;
    }

    /**
     * Adds specified order to the array.
     *
     * @param item  The specified FoodItem to be added to the array.
     */
    public void add(FoodItem item)
    {
        if (current < orders.length)
        {
            orders[current] = item;
            item.setTimeOrdered();
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
            add(item);
        }
        notifyObservers();
    }

    /**
     * Get the number of FoodItems in the array.
     *
     * @return      Returns the number of FoodItems in the array.
     */
    public int getSize()
    {
        return current;
    }
}
