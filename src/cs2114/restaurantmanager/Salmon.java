package cs2114.restaurantmanager;

/**
 *  Salmon class that contains the menu item's specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.04.10
 */
public class Salmon extends FoodItem
{
    /**
     * Creates a new Salmon object.
     */
    public Salmon()
    {
        name = "Fried Salmon";
        ingredients = "A 6 ounce salmon fillet, one teaspoon of new "
            + "orleans seafood season, teaspoon of garlic powder and "
            + "lemon.";
        cost = 8.99;
    }
}