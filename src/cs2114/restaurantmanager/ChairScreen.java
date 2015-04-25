package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

public class ChairScreen
    extends Screen
{
    private Restaurant restaurant;
    private int table;
    private int chair;

    public void initialize(Restaurant rest, int tableNum, int chairNum)
    {
        restaurant = rest;
        table = tableNum;
        chair = chairNum;
    }


    public void chairToTableClicked()
    {
        presentScreen(TableScreen.class);
        finish();
    }
}
