package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

public class ChairScreen
    extends Screen
{

    public void initialize()
    {

    }

    public void chair1Clicked()
    {
        presentScreen(OrderScreen.class);
        finish();
    }
    public void chair2Clicked()
    {
        presentScreen(OrderScreen.class);
        finish();
    }
    public void chair3Clicked()
    {
        presentScreen(OrderScreen.class);
        finish();
    }
    public void chair4Clicked()
    {
        presentScreen(OrderScreen.class);
        finish();
    }
    public void chair5Clicked()
    {
        presentScreen(OrderScreen.class);
        finish();
    }
    public void chair6Clicked()
    {
        presentScreen(OrderScreen.class);
        finish();
    }


    public void bill1Clicked()
    {
        presentScreen(BillScreen.class);
        finish();
    }
    public void bill2Clicked()
    {
        presentScreen(BillScreen.class);
        finish();
    }
    public void bill3Clicked()
    {
        presentScreen(BillScreen.class);
        finish();
    }

    public void chairToTableClicked()
    {
        presentScreen(TableScreen.class);
        finish();
    }
}
