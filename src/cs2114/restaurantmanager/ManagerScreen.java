package cs2114.restaurantmanager;

import sofia.app.Screen;

/**
 *  The shell for the Manager Screen class.
 *  This would be implemented when the application has a connection to a server.
 *  Whereby it could retrieve data that had been recorded about precious
 *  business including time data and point of sales.
 *
 *  @author Zheng Wang (zhengw8)
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.27
 */
public class ManagerScreen
    extends Screen
{
    /**
     * An empty initialize method.
     */
    public void initialize()
    {
        //An empty initialize methodl.
    }

    /**
     * Presents the MainScreen when the managerToMenu button is presssed.
     */
    public void managerToMenuClicked()
    {
        presentScreen(MainScreen.class);
        finish();
    }
}