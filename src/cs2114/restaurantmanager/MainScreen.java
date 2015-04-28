package cs2114.restaurantmanager;

import sofia.app.Screen;
import android.widget.*;

/**
 *  Creates the Main Screen used by the application when it first begins.
 *
 *  @author Zheng Wang (zhengw8)
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class MainScreen
    extends Screen
{
    private Restaurant restaurant;
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
        managersData.setEnabled(false);  //Until data can be put to csv
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
        presentScreen(CookerScreen.class, restaurant);
        finish();
    }

    /**
     * Presents the Manager's Screen when the button has been pressed.
     */
    public void managersDataClicked()
    {
        presentScreen(ManagerScreen.class, restaurant);
        finish();
    }
}