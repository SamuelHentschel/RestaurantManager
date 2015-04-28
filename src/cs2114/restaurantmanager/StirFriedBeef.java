package cs2114.restaurantmanager;

/**
 *  Stir Fried beef class that contains the menu item's
 *  specifications.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.04.10
 */
public class StirFriedBeef extends FoodItem
{
    /**
     * Create a new StirFriedBeef object.
     */
    public StirFriedBeef()
    {
        name = "Stir Fried Beef";
        ingredients = "Half pound of steak, one green "
            + "bell pepper, half an onion, two tablespoons"
            + " of korean marinade. Served on rice.";
        cost = 11.99;
    }
}