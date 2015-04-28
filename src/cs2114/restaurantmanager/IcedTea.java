package cs2114.restaurantmanager;

/**
 *  Iced tea class that contains the menu item's
 *  specifications such as name, ingredients and
 *  cost.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.03.26
 */
public class IcedTea extends FoodItem
{
    /**
     * Create a new IcedTea object.
     */
    public IcedTea()
    {
        super();
        name = "Iced Tea";
        ingredients = "One spoon of lipton iced tea powered mix,"
            + " a cup of water and ice with a slice of lemon.";
        cost = 1.49;
    }
}