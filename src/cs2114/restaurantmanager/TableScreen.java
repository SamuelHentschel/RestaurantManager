package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

public class TableScreen
    extends Screen
{

    public void initialize()
    {

    }


    public void backToMenuClicked()
    {
        presentScreen(MainScreen.class);
        finish();
    }
}
