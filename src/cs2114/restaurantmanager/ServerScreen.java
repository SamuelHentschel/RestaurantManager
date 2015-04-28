package cs2114.restaurantmanager;

import android.widget.Button;
import sofia.app.Screen;

/**
 *  The model for the server screen which shows all the tables that are in the
 *  restaurant.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class ServerScreen
extends Screen
{
    private Restaurant restaurant;
    private Button table1;
    private Button table2;
    private Button table3;
    private Button table4;
    private Button table5;
    private Button table6;
    private Button table7;
    private Button table8;
    private Button table9;
    private Button table10;
    private Button table11;
    private Button table12;
    private Button table13;
    private Button table14;
    private Button table15;
    private Button table16;
    private Button table17;
    private Button table18;
    private Button table19;
    private Button table20;
    private Button[] buttons;

    /**
     * Initializes restaurant as the current array of tables.
     *
     * @param rest    The restaurant object being used by the application.
     */
    public void initialize(Restaurant rest)
    {
        restaurant = rest;
        buttons = new Button[] {table1, table2, table3, table4, table5, table6,
            table7, table8, table9, table10, table11, table12, table13, table14,
            table15, table16, table17, table18, table19, table20};

        //Checking and coloring a table with the correct ProcessColor
        //Going through Tables
        for (int i = 0; i < restaurant.getTables().length; i++)
        {
            Table tempTable = restaurant.getTables()[i];

            if (tempTable == null)
            {
                buttons[i].setBackgroundColor(ProcessColor.CLEAR);
            }
            else if (tempTable.getTimePaid() != 0)
            {
                buttons[i].setBackgroundColor(ProcessColor.BUS);
            }
            else
            {
                //Going through Chairs
                int maxChair = 0;
                boolean empty = false;
                for (int j = 0; j < tempTable.getNumChairs(); j++)
                {
                    Chair tempChair = tempTable.getChairs()[j];
                    if (tempChair != null)
                    {
                        int maxOrder = 0;
                        //Going through Orders of a Chair
                        if (tempChair.getSize() == 0)
                        {
                            empty = true;
                        }
                        else
                        {
                            for (int k = 0; k < tempChair.getSize(); k++)
                            {
                                if (tempChair.getOrders()[k].getTimeDelivered() != 0)
                                {
                                    if (1 > maxOrder) maxOrder = 1;
                                }
                                else if (tempChair.getOrders()[k].getTimeFinishedCooking() != 0)
                                {
                                    if (4 > maxOrder) maxOrder = 4;
                                }
                                else if (tempChair.getOrders()[k].getTimeStartedCooking() != 0)
                                {
                                    if (3 > maxOrder) maxOrder = 3;
                                }
                                else
                                {
                                    if (2 > maxOrder) maxOrder = 2;
                                }
                            }
                        }
                        if (maxOrder > maxChair) maxChair = maxOrder;
                    }
                }

                //Colors the button with the ProcessColor of the most important
                //part of the process that table is in.
                if (maxChair == 1 && !empty)
                {
                    buttons[i].setBackgroundColor(ProcessColor.DELIVERED);
                }
                else if (maxChair == 2 && !empty)
                {
                    buttons[i].setBackgroundColor(ProcessColor.ORDERED);
                }
                else if (maxChair == 3 && !empty)
                {
                    buttons[i].setBackgroundColor(ProcessColor.COOKING);
                }
                else if (maxChair == 4)
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
     * Presents the Main Screen when the button is pressed.
     */
    public void serverToMenuClicked()
    {
        presentScreen(MainScreen.class, restaurant);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table1Clicked()
    {
        if (restaurant.getTables()[0] == null)
        {
            restaurant.getTables()[0]= new Table(0);
        }
        presentScreen(TableScreen.class, restaurant, 1);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table2Clicked()
    {
        if (restaurant.getTables()[1] == null)
        {
            restaurant.getTables()[1]= new Table(1);
        }
        presentScreen(TableScreen.class, restaurant, 2);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table3Clicked()
    {
        if (restaurant.getTables()[2] == null)
        {
            restaurant.getTables()[2]= new Table(2);
        }
        presentScreen(TableScreen.class, restaurant, 3);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table4Clicked()
    {
        if (restaurant.getTables()[3] == null)
        {
            restaurant.getTables()[3]= new Table(3);
        }
        presentScreen(TableScreen.class, restaurant, 4);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table5Clicked()
    {
        if (restaurant.getTables()[4] == null)
        {
            restaurant.getTables()[4]= new Table(4);
        }
        presentScreen(TableScreen.class, restaurant, 5);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table6Clicked()
    {
        if (restaurant.getTables()[5] == null)
        {
            restaurant.getTables()[5]= new Table(5);
        }
        presentScreen(TableScreen.class, restaurant, 6);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table7Clicked()
    {
        if (restaurant.getTables()[6] == null)
        {
            restaurant.getTables()[6]= new Table(6);
        }
        presentScreen(TableScreen.class, restaurant, 7);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table8Clicked()
    {
        if (restaurant.getTables()[7] == null)
        {
            restaurant.getTables()[7]= new Table(7);
        }
        presentScreen(TableScreen.class, restaurant, 8);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table9Clicked()
    {
        if (restaurant.getTables()[8] == null)
        {
            restaurant.getTables()[8]= new Table(8);
        }
        presentScreen(TableScreen.class, restaurant, 9);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table10Clicked()
    {
        if (restaurant.getTables()[9] == null)
        {
            restaurant.getTables()[9]= new Table(9);
        }
        presentScreen(TableScreen.class, restaurant, 10);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table11Clicked()
    {
        if (restaurant.getTables()[10] == null)
        {
            restaurant.getTables()[10]= new Table(10);
        }
        presentScreen(TableScreen.class, restaurant, 11);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table12Clicked()
    {
        if (restaurant.getTables()[11] == null)
        {
            restaurant.getTables()[11]= new Table(11);
        }
        presentScreen(TableScreen.class, restaurant, 12);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table13Clicked()
    {
        if (restaurant.getTables()[12] == null)
        {
            restaurant.getTables()[12]= new Table(12);
        }
        presentScreen(TableScreen.class, restaurant, 13);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table14Clicked()
    {
        if (restaurant.getTables()[13] == null)
        {
            restaurant.getTables()[13]= new Table(13);
        }
        presentScreen(TableScreen.class, restaurant, 14);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table15Clicked()
    {
        if (restaurant.getTables()[14] == null)
        {
            restaurant.getTables()[14]= new Table(14);
        }
        presentScreen(TableScreen.class, restaurant, 15);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table16Clicked()
    {
        if (restaurant.getTables()[15] == null)
        {
            restaurant.getTables()[15]= new Table(15);
        }
        presentScreen(TableScreen.class, restaurant, 16);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table17Clicked()
    {
        if (restaurant.getTables()[16] == null)
        {
            restaurant.getTables()[16]= new Table(16);
        }
        presentScreen(TableScreen.class, restaurant, 17);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table18Clicked()
    {
        if (restaurant.getTables()[17] == null)
        {
            restaurant.getTables()[17]= new Table(17);
        }
        presentScreen(TableScreen.class, restaurant, 18);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table19Clicked()
    {
        if (restaurant.getTables()[18] == null)
        {
            restaurant.getTables()[18]= new Table(18);
        }
        presentScreen(TableScreen.class, restaurant, 19);
        finish();
    }

    /**
     * Presents the Table Screen when the button is pressed.
     */
    public void table20Clicked()
    {
        if (restaurant.getTables()[19] == null)
        {
            restaurant.getTables()[19]= new Table(19);
        }
        presentScreen(TableScreen.class, restaurant, 20);
        finish();
    }
}