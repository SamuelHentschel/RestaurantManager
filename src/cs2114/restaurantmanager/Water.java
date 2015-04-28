package cs2114.restaurantmanager;

/**
 *  A Water class that contains the food item's specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.04.26
 */
public class Water extends FoodItem
{
    /**
     * Create a new Water object.
     */
    public Water()
    {
        super();
        name = "Water";
        ingredients = "Two large ice cubes in a cup"
            + " of fresh, filtered water.";
        cost = 0;
    }
}