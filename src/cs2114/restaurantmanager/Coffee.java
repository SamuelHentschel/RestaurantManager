package cs2114.restaurantmanager;

/**
 *  Coffee class that contains the menu item's
 *  specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.03.26
 */
public class Coffee extends FoodItem
{
    /**
     * Create a new Coffee object.
     */
    public Coffee()
    {
        name = "Coffee";
        ingredients = "Served with choice of expresso shots, "
            + "flavored syrups or whipped cream.";
        cost = 1.49;
    }
}