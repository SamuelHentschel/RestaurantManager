package cs2114.restaurantmanager;

/**
 *  Creates a new food object which implements the methods of the IFoodItem
 *  interface.  In addition it also provides the variables every subclass of
 *  FoodItem should have.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 22, 2015
 */
abstract class FoodItem
{
    //Fields
    /**
     * A field to hold the name of the food item.
     */
    protected String name;
    /**
     * A field to hold the ingredients in the food item.
     */
    protected String ingredients;
    /**
     * A field to hold the cost of the food item.
     */
    protected double cost;
    /**
     * A field to hold the notes about the preparation of the food item.
     */
    protected String note;
    /**
     * A field to hold the time the food item was ordered.
     */
    protected long timeOrdered;
    /**
     * A field to hold the time the food item started to be cooked.
     */
    protected long timeStartedCooking;
    /**
     * A field to hold the time the food item was finished cooking.
     */
    protected long timeFinishedCooking;
    /**
     * A field to hold the time the food item was delivered.
     */
    protected long timeDelivered;

    //Constructors
    /**
     * Creates a new food item and initializes every field to an empty value.
     */
    public FoodItem()
    {
        name = null;
        ingredients = null;
        cost = 0;
        note = null;
        timeOrdered = 0;
        timeStartedCooking = 0;
        timeFinishedCooking = 0;
        timeDelivered = 0;
    }

    //Methods
    /**
     * Gets the name of the food item.
     *
     * @return      Returns the name of the food item.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the ingredients of the food item.
     *
     * @return      Returns the ingredients in the food item.
     */
    public String getIngredients()
    {
        return ingredients;
    }

    /**
     * Gets the cost of the food item.
     *
     * @return      Returns the cost of the food item.
     */
    public double getCost()
    {
        return cost;
    }

    /**
     * Gets the notes on the preparation of the food item.
     *
     * @return      Returns the note about preparation of the food item.
     */
    public String getNote()
    {
        return note;
    }

    /**
     * Sets the note to the specified string.
     *
     * @param str   The string to set the note field to.
     */
    public void setNote(String str)
    {
        note = str;
    }

    /**
     * Gets the time the food item was ordered.
     *
     * @return      Returns the time the food item was ordered.
     */
    public long getTimeOrdered()
    {
        return timeOrdered;
    }

    /**
     * Sets the time the food item was ordered.
     */
    public void setTimeOrdered()
    {
        timeOrdered = System.currentTimeMillis();
    }

    /**
     * Gets the time the food started cooking.
     *
     * @return      Returns the time the food started cooking.
     */
    public long getTimeStartedCooking()
    {
        return timeStartedCooking;
    }

    /**
     * Sets the time the food started cooking.
     */
    public void setTimeStartedCooking()
    {
        timeStartedCooking = System.currentTimeMillis();
    }

    /**
     * Gets the time the food finished cooking.
     *
     * @return      Returns the time the food finished cooking.
     */
    public long getTimeFinishedCooking()
    {
        return timeFinishedCooking;
    }

    /**
     * Sets the time the food finished cooking.
     */
    public void setTimeFinishedCooking()
    {
        timeFinishedCooking = System.currentTimeMillis();
    }

    /**
     * Gets the time the food was delivered.
     *
     * @return      Returns the time the food was delivered.
     */
    public long getTimeDelivered()
    {
        return timeDelivered;
    }

    /**
     * Sets the time the food was delivered.
     */
    public void setTimeDelivered()
    {
        timeDelivered = System.currentTimeMillis();
    }

    public String toString()
    {
        String food =
            name + "\t" + cost + "\n" +
            "Ingredients: " + ingredients + "\n" +
            "Notes:\t" + note;
        return food;
    }
}
