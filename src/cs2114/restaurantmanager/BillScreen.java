package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

public class BillScreen
    extends Screen
{

    public void initialize()
    {

    }


    public void billToTableClicked()
    {
        presentScreen(TableScreen.class);
        finish();
    }
}
