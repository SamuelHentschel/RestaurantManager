package cs2114.restaurantmanager;
/**
 *  Creates the BLT class that contains the menu item's
 *  specifications.
 *
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version Mar 26, 2015
 */
public class BLT extends FoodItem
{
    /**
     * Create a new BLT object.
     */
    public BLT()
    {
        super();
        name = "BLT Sandwich";
        ingredients = "Bacon, lettuce, tomato and mayo on a choice"
            + " of wheat, white, potato or rye bread.";
        cost = 4.99;
    }
}
