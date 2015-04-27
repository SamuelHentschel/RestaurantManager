package cs2114.restaurantmanager;

import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

public class BillScreen
    extends Screen
{

    private Restaurant restaurant;
    private int tableNumber;
    private int billNumber;
    private Bill billAll;
    private TextView billView;


    public void initialize(Restaurant rest, int tNum)
    {
        restaurant = rest;
        tableNumber = tNum;
        Table table = restaurant.getTables()[tableNumber-1];
        billAll = new Bill();

        for (Chair ch : table.getChairs())
        {
            if ( ch != null)
            {
                for ( FoodItem item : ch.getOrders())
                {
                    if ( item != null)
                    {
                        billAll.addToBill(item);
                    }
                }
            }
        }

        billView.setText(billAll.toString());
    }


    public void billToTableClicked()
    {
        presentScreen(TableScreen.class, restaurant, tableNumber);
        finish();
    }

    public void paidBillClicked()
    {
        restaurant.getTables()[tableNumber-1].setTimePaid();
        for (int i = 0; i < restaurant.getTables()[tableNumber-1].getNumChairs(); i++)
        {
            restaurant.getTables()[tableNumber-1].getChairs()[i] = null;
        }
        presentScreen(ServerScreen.class, restaurant);
        finish();
    }
}
