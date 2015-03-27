package cs2114.restaurantmanager;

// -------------------------------------------------------------------------
/**
 *  Creates the BLT class that contains the menu item's
 *  specifications and extends FoodItem.
 *
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version Mar 26, 2015
 */
public class BLT extends FoodItem
{
    // ----------------------------------------------------------
    /**
     * Create a new BLT object.
     */
    public BLT()
    {
        super();
        name = "BLT Sandwich";
        ingredients = "Three strips of bacon, lettuce, two slices of tomato,"
            + "light mayonaisse.";
        cost = 4.99;
    }
}
