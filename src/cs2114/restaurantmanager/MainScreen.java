package cs2114.restaurantmanager;

import sofia.app.Screen;
import android.widget.*;

/**
 *  Screen Class for Android application
 *  which initiate all shapes and GUI of the application
 *
 *  @author LegitMe
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class MainScreen
    extends Screen
{
    private Restaurant restaurant;
    //private Button serversTable;
    //private Button cookersList;
    private Button managersData;

    /**
     * Initializes a new restaurant.
     */
    public void initialize()
    {
        restaurant = new Restaurant();
        managersData.setEnabled(false);  //Until data can be put to csv
    }

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
     * Presents the Server Screen when the button has been pressed.
     */
    public void serversTableClicked()
    {
        presentScreen(ServerScreen.class, restaurant);
        finish();
    }

    /**
     * Presents the Cooks Screen when the button has been pressed.
     */
    public void cookersListClicked()
    {
        presentScreen(CookerScreen.class);
        finish();
    }

    /**
     * Presents the Manager's Screen when the button has been pressed.
     */
    public void managersDataClicked()
    {
        presentScreen(ManagerScreen.class);
        finish();
    }
}
