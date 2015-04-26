package cs2114.restaurantmanager;

import sofia.app.Screen;

/**
 *  The controller for the table screen which shows all the tables that are in
 *  the restaurant.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class TableScreen
    extends Screen
{
    private Restaurant restaurant;
    private int tableNumber;
    private Table table;

    /**
     * Initializes restaurant as the current array of tables.
     *
     * @param rest      The restaurant object being used by the application.
     * @param tableNum  The number of the current table.
     */
    public void initialize(Restaurant rest, int tNum)
    {
        restaurant = rest;
        tableNumber = tNum;
        table = new Table(tableNumber-1);
    }

    /**
     * Presents the Chair Screen when the button is pressed.
     */
    public void chair1Clicked()
    {
        presentScreen(ChairScreen.class, restaurant, tableNumber, 1);
        finish();
    }

    /**
     * Presents the Chair Screen when the button is pressed.
     */
    public void chair2Clicked()
    {
        presentScreen(ChairScreen.class, restaurant, tableNumber, 2);
        finish();
    }

    /**
     * Presents the Chair Screen when the button is pressed.
     */
    public void chair3Clicked()
    {
        presentScreen(ChairScreen.class, restaurant, tableNumber, 3);
        finish();
    }

    /**
     * Presents the Chair Screen when the button is pressed.
     */
    public void chair4Clicked()
    {
        presentScreen(ChairScreen.class, restaurant, tableNumber, 4);
        finish();
    }

    /**
     * Presents the Chair Screen when the button is pressed.
     */
    public void chair5Clicked()
    {
        presentScreen(ChairScreen.class, restaurant, tableNumber, 5);
        finish();
    }

    /**
     * Presents the Chair Screen when the button is pressed.
     */
    public void chair6Clicked()
    {
        presentScreen(ChairScreen.class, restaurant, tableNumber, 6);
        finish();
    }

    public void bill1Clicked()
    {
        presentScreen(BillScreen.class, restaurant);
        finish();
    }

    public void bill2Clicked()
    {
        presentScreen(BillScreen.class, restaurant);
        finish();
    }

    public void bill3Clicked()
    {
        presentScreen(BillScreen.class, restaurant);
        finish();
    }

    public void tableToServerClicked()
    {
        presentScreen(ServerScreen.class, restaurant);
        finish();
    }
}
