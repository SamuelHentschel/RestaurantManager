package cs2114.restaurantmanager;

// -------------------------------------------------------------------------
/**
 *  Creates a Hot Dog menu item that extends FoodItem.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version Mar 26, 2015
 */
public class HotDog extends FoodItem
{
    // ----------------------------------------------------------
    /**
     * Create a new HotDog object.
     */
    public HotDog()
    {
        super();
        name = "Hot Dog";
        ingredients = "1 Weiner, 1 Bun, light mustard and ketchup";
        cost = 2.99;
    }
}
