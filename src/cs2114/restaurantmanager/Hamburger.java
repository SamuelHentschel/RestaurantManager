package cs2114.restaurantmanager;
/**
 *  Creates a new Hamburger object that has the item's specifications
 *  such as name, ingredients, etc.
 *
 *  @author Calogero
 *  @version Mar 26, 2015
 */
public class Hamburger extends FoodItem
{
    /**
     * Create a new Hamburger object.
     */
    public Hamburger()
    {
        super();
        name = "Hamburger";
        ingredients = "One hamburger bun, one hamburger patty, lettuce, "
            + "one slice of tomato, onions and two pickles. Served with"
            + "fries.";
        cost = 4.99;
    }

}
