package cs2114.restaurantmanager;

import android.widget.*;
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
    private TextView tableNum;
    private Button[] buttons;
    private Button chair1;
    private Button chair2;
    private Button chair3;
    private Button chair4;
    private Button chair5;
    private Button chair6;

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
        buttons = new Button[] {chair1, chair2, chair3, chair4, chair5, chair6};

        if (restaurant.getTables()[tableNumber-1] == null)
        {
            restaurant.getTables()[tableNumber-1] = new Table(tableNumber);
        }

        table = restaurant.getTables()[tableNumber-1];

        tableNum.setText("Table " + tableNumber);

        for (int i = 0; i < table.getNumChairs(); i++)
        {
            Chair temp = table.getChairs()[i];
            if (temp == null)
            {
                buttons[i].setBackgroundColor(ProcessColor.CLEAR);
            }
            else if(temp.getSize() == 0)
            {
                buttons[i].setBackgroundColor(ProcessColor.SEATED);
            }
            else
            {
                int max = 4;
                for (int j = 0; j < temp.getSize(); j++)
                {
                    if (temp.getOrders()[j].getTimeDelivered() != 0)
                    {
                        if (4 < max) max = 4;
                    }
                    else if (temp.getOrders()[j].getTimeFinishedCooking() != 0)
                    {
                        if (3 < max) max = 3;
                    }
                    else if (temp.getOrders()[j].getTimeStartedCooking() != 0)
                    {
                        if (2 < max) max = 2;
                    }
                    else
                    {
                        max = 1;
                    }
                }
                if (max == 1)
                {
                    buttons[i].setBackgroundColor(ProcessColor.ORDERED);
                }
                else if (max == 2)
                {
                    buttons[i].setBackgroundColor(ProcessColor.COOKING);
                }
                else if (max == 3)
                {
                    buttons[i].setBackgroundColor(ProcessColor.COOKED);
                }
                else
                {
                    buttons[i].setBackgroundColor(ProcessColor.DELIVERED);
                }
            }
        }
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

    public void showBillClicked()
    {
        presentScreen(BillScreen.class, restaurant, tableNumber);
        finish();
    }


    public void tableToServerClicked()
    {
        presentScreen(ServerScreen.class, restaurant);
        finish();
    }
}
