package cs2114.restaurantmanager;
/**
 *  Quesadilla class that contains the menu item's
 *  specifications such as name, ingredients and
 *  cost.
 *
 *  @author Calogero Ramirez (frcalo5)
 *  @version 2015.04.10
 */
public class Quesadilla extends FoodItem
{
    /**
     * Create a new Quesadilla object.
     */
    public Quesadilla()
    {
        super();
        name = "Quesadilla";
        ingredients = "Chicken breasts, salt, pepper"
            + ", chopped onions, taco seasoning mix, "
            + "teaspoon of butter, monterey jack cheese"
            + "and one large flour tortilla.";
        cost = 5.99;
    }
}
