package cs2114.restaurantmanager;
/**
 *  A hotdog class that contains the menu item's
 *  specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.03.26
 */
public class HotDog extends FoodItem
{
    /**
     * Create a new HotDog object.
     */
    public HotDog()
    {
        super();
        name = "Hot Dog";
        ingredients = "1 Weiner, 1 Bun, light mustard and ketchup. Served "
            + "with fries.";
        cost = 2.99;
    }
}
