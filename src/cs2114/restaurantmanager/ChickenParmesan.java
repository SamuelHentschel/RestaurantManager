package cs2114.restaurantmanager;

// -------------------------------------------------------------------------
/**
 *  Creates a Chicken Parmesan that extends
 *  FoodItem.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version Mar 26, 2015
 */
public class ChickenParmesan extends FoodItem
{
    // ----------------------------------------------------------
    /**
     * Create a new ChickenParmesan object.
     */
    public ChickenParmesan()
    {
        super();
        name = "Chicken Parmesan";
        ingredients = "Chicken breast cutlet, paramesan cheese, "
            + "1/4 cup of olive oil, 2 eggs, 1 cup of breadcrumbs, "
            + "salt and mozzarella cheese.";
        cost = 14.99;
    }
}
