package cs2114.restaurantmanager;

import sofia.app.Screen;
import android.widget.*;

/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author Zheng Wang (zhengw8)
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.27
 */
public class BillScreen
    extends Screen
{
    private Restaurant restaurant;
    private int tableNumber;
    private Bill billAll;
    private TextView billView;

    /**
     * Initializes the BillScreen class.
     * Totaling all the food together into an array. adding it to the bill,
     * then printing the Bill to the screen.
     *
     * @param rest      The restaurant object being used by the application.
     * @param tNum      The number of the current table being billed.
     */
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

    /**
     * If the billToTable button is clicked it returns the user to the previous
     * TableSCreen.
     */
    public void billToTableClicked()
    {
        presentScreen(TableScreen.class, restaurant, tableNumber);
        finish();
    }

    /**
     * If the paidBill button is clicked then it sets the table's timePaid
     * variable, sets all the chairs to null (to clear out the table) and
     * presents the ServerScreen.
     */
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