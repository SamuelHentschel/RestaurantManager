package cs2114.restaurantmanager;

/**
 *  BBQChickenPizza class that contains the menu
 *  item's specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.04.`0
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