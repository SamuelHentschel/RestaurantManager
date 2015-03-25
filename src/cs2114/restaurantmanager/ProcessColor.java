package cs2114.restaurantmanager;

import sofia.graphics.Color;

/**
 *  Associates the step of the process with the color being used to represent
 *  it.  These will be used to color code the tables, chairs, and orders.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 25, 2015
 */
class ProcessColor
{
    /**
     * A field that relates a clear table to the color white.
     */
    public static final Color CLEAR = Color.white;
    /**
     * A field that relates a seated table to the color yellow.
     */
    public static final Color SEATED = Color.yellow;
    /**
     * A field that relates a table who has ordered to the color blue.
     */
    public static final Color ORDERED = Color.blue;
    /**
     * A field that relates a table who's food is cooking to the color orange.
     */
    public static final Color COOKING = Color.blue;
    /**
     * A field that relates a table who's food is done cooking to the color red.
     */
    public static final Color COOKED = Color.red;
    /**
     * A field that relates a table who's food has been delivered to the color
     * green.
     */
    public static final Color DELIVERED = Color.green;
    /**
     * A field that relates a table that needs to be bussed to the color gray.
     */
    public static final Color BUS = Color.gray;
}