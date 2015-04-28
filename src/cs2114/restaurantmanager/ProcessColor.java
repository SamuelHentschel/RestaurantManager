package cs2114.restaurantmanager;

import sofia.graphics.Color;

/**
 *  Associates the step of the process with the color being used to represent
 *  it.  These will be used to color code the tables, chairs, and orders.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.03.25
 */
class ProcessColor
{
    //Fields
    /**
     * A field that relates a clear table to the color white.
     */
    public static int CLEAR = Color.white.toRawColor();
    /**
     * A field that relates a seated table to the color yellow.
     */
    public static final int SEATED = Color.yellow.toRawColor();
    /**
     * A field that relates a table who has ordered to the color blue.
     */
    public static final int ORDERED = Color.blue.toRawColor();
    /**
     * A field that relates a table who's food is cooking to the color orange.
     */
    public static final int COOKING = Color.orange.toRawColor();
    /**
     * A field that relates a table who's food is done cooking to the color red.
     */
    public static final int COOKED = Color.red.toRawColor();
    /**
     * A field that relates a table who's food has been delivered to the color
     * green.
     */
    public static final int DELIVERED = Color.green.toRawColor();
    /**
     * A field that relates a table that needs to be bussed to the color gray.
     */
    public static final int BUS = Color.gray.toRawColor();
}