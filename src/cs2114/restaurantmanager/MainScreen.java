package cs2114.restaurantmanager;


import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

// -------------------------------------------------------------------------
/**
 *  Screen Class for Android application
 *  which initiate all shapes and GUI of the application
 *
 *  @author LegitMe
 *  @version 2015.03.20
 */
public class MainScreen
    extends Screen
{

    public void initialize()
    {

    }

    public void serversTableClicked()
    {
        presentScreen(ServerScreen.class);
        finish();
    }

    public void cookersListClicked()
    {
        presentScreen(CookerScreen.class);
        finish();
    }

    public void managersDataClicked()
    {
        presentScreen(ManagerScreen.class);
        finish();
    }
}
