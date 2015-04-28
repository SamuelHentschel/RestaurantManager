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
    private Button busButton;
    private Button showBill;

    /**
     * Initializes restaurant as the current array of tables.
     *
     * @param rest      The restaurant object being used by the application.
     * @param tNum      The number of the current table.
     */
    public void initialize(Restaurant rest, int tNum)
    {
        //Gets the position data.
        restaurant = rest;
        tableNumber = tNum;

        buttons = new Button[] {chair1, chair2, chair3, chair4, chair5, chair6};

        //Creates a new table if the one at the specified position is null.
        if (restaurant.getTables()[tableNumber-1] == null)
        {
            restaurant.getTables()[tableNumber-1] = new Table(tableNumber);
        }

        //Sets the current table to the specified one for easier coding.
        table = restaurant.getTables()[tableNumber-1];

        //Checks to see if it should allow a Bill to be created or the table
        //to be busse.
        if (table.getTimePaid() == 0)
        {
            busButton.setEnabled(false);
            int delNum = 0;
            int tot = 0;
            for (Chair chair: table.getChairs())
            {
                if (chair != null)
                {
                    for (FoodItem order: chair.getOrders())
                    {
                        if (order != null)
                        {
                            tot++;
                            if (order.getTimeDelivered() != 0)
                            {
                                delNum++;
                            }
                        }
                    }
                }
            }
            if (tot == delNum)
            {
                showBill.setEnabled(true);
            }
            else
            {
                showBill.setEnabled(false);
            }
        }
        else
        {
            busButton.setEnabled(true);
        }

        tableNum.setText("Table " + tableNumber);

      //Colors the chairs based on the appropriate points in the process.
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
                int max = 0;
                for (int j = 0; j < temp.getSize(); j++)
                {
                    if (temp.getOrders()[j].getTimeDelivered() != 0)
                    {
                        if (1 > max) max = 1;
                    }
                    else if (temp.getOrders()[j].getTimeFinishedCooking() != 0)
                    {
                        if (4 > max) max = 4;
                    }
                    else if (temp.getOrders()[j].getTimeStartedCooking() != 0)
                    {
                        if (3 > max) max = 3;
                    }
                    else
                    {
                        if (2 > max) max = 2;
                    }
                }

                if (max == 1)
                {
                    buttons[i].setBackgroundColor(ProcessColor.DELIVERED);
                }
                else if (max == 2)
                {
                    buttons[i].setBackgroundColor(ProcessColor.ORDERED);
                }
                else if (max == 3)
                {
                    buttons[i].setBackgroundColor(ProcessColor.COOKING);
                }
                else if (max == 4)
                {
                    buttons[i].setBackgroundColor(ProcessColor.COOKED);
                }
                else
                {
                    buttons[i].setBackgroundColor(ProcessColor.SEATED);
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

    /**
     * Presents the Bill Screen when the button is pressed.
     */
    public void showBillClicked()
    {
        presentScreen(BillScreen.class, restaurant, tableNumber);
        finish();
    }

    /**
     * Resets the table and sets the timeBussed variable of the table to the
     * current time.
     */
    public void busButtonClicked()
    {
        restaurant.getTables()[tableNumber-1].setTimeBussed();
        restaurant.getTables()[tableNumber-1] = null;
        presentScreen(ServerScreen.class, restaurant);
        finish();
    }

    /**
     * Presents the previous ServerScreen when the tableToServer button is
     * pressed.
     */
    public void tableToServerClicked()
    {
        presentScreen(ServerScreen.class, restaurant);
        finish();
    }
}