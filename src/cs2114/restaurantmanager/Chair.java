package cs2114.restaurantmanager;

import sofia.util.*;

/**
 *  Create a new Chair which holds the specific orders of a specific customer.
 *  Uses a FoodItem array to hold the orders.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.27
 */
class Chair
    extends Observable
{
    //Fields
    private FoodItem[] orders;
    private int current;
    private int chair;

    //Constructors
    /**
     * Creates a new Chair with the default number of 10 orders.
     *
     * @param cNum      The number of the current chair.
     */
    public Chair(int cNum)
    {
        orders = new FoodItem[10];
        current = 0;
        chair = cNum;
    }

    /**
     * Returns the number of the current chair.
     *
     * @return      Returns the current chair's number.
     */
    public int number()
    {
        return chair;
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