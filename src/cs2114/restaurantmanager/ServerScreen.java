package cs2114.restaurantmanager;

import sofia.app.Screen;

/**
 *  The model for the server screen which shows all the tables that are in the
 *  restaurant.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class ServerScreen
    extends Screen
{
    private Restaurant restaurant;

    /**
     * Initializes restaurant as the current array of tables.
     *
     * @param rest    The restaurant object being used by the application.
     */
    public void initialize(Restaurant rest)
    {
        restaurant = rest;
    }

    /**
     * Presents the Main Screen when the button is pressed.
     */
    public void serverToMenuClicked()
    {
        presentScreen(MainScreen.class, restaurant);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table1Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 1);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table2Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 2);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table3Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 3);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table4Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 4);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table5Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 5);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table6Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 6);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table7Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 7);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table8Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 8);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table9Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 9);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table10Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 10);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table11Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 11);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table12Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 12);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table13Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 13);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table14Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 14);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table15Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 15);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table16Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 16);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table17Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 17);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table18Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 18);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table19Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 19);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table20Clicked()
    {
        presentScreen(TableScreen.class, restaurant, 20);
        finish();
    }
}
