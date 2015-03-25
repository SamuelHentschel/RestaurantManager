package cs2114.restaurantmanager;

/**
 *  Creates a new FoodItem object which describes the methods and fields to be
 *  used by the subclasses of FoodItem.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 25, 2015
 */
class FoodItem
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
    private String note;
    private long timeOrdered;
    private long timeStartedCooking;
    private long timeFinishedCooking;
    private long timeDelivered;

    //Constructors
    /**
     * Creates a new FoodItem and initializes the fields.
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
     * @return      Returns the note on the food preparation.
     */
    public String getNote()
    {
        return note;
    }

    /**
     * Sets the note to the specified string.
     *
     * @param str   The string to set note to.
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
     * Sets the time the food was ordered.
     */
    public void setTimeOrdered()
    {
        timeOrdered = System.currentTimeMillis();
    }

    /**
     * Gets the time the food started being cooked.
     *
     * @return      Returns the time the food started being cooked.
     */
    public long getTimeStartedCooking()
    {
        return timeStartedCooking;
    }

    /**
     * Set the time the food started being cooked.
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
        return name + "\t" + cost + "\n" + "Ingredients: " + ingredients + "\n"
            + "Notes:\t" + note;
    }
}
