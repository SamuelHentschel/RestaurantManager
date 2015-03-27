package cs2114.restaurantmanager;
/**
 *  Creates a Chicken Parmesan that contains the menu
 *  item's specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version Mar 26, 2015
 */
public class ChickenParmesan extends FoodItem
{
    /**
     * Create a new ChickenParmesan object.
     */
    public ChickenParmesan()
    {
        super();
        name = "Chicken Parmesan";
        ingredients = "Crispy, hand-breaded fried chicken strips topped"
            + " with marinara and mozzarella cheese.";
        cost = 14.99;
    }
}
