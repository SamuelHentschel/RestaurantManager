package cs2114.restaurantmanager;

// -------------------------------------------------------------------------
/**
 *  Creates a Sprite object that extends FoodItem
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version Mar 26, 2015
 */
public class Sprite extends FoodItem
{
    // ----------------------------------------------------------
    /**
     * Create a new Sprite object.
     */
    public Sprite()
    {
        super();
        name = "Sprite";
        ingredients = "N/A";
        cost = 1.50;
    }
}
