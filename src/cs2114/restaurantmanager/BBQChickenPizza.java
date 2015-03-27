package cs2114.restaurantmanager;
/**
 *  BBQChickenPizza class that contains the menu
 *  item's specifications.
 *
 *  @author Calogero
 *  @version Mar 26, 2015
 */
public class BBQChickenPizza extends FoodItem
{
    /**
     * Create a new BBQChickenPizza object.
     */
    public BBQChickenPizza()
    {
        super();
        name = "BBQ Chicken Pizza";
        ingredients = "Grilled barbeque chicken, onions,"
            + " cheddar and mozzarella cheese.";
        cost = 12.99;

    }
}
