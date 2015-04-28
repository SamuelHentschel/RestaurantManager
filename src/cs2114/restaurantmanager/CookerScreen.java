package cs2114.restaurantmanager;

import android.widget.TextView;
import android.widget.LinearLayout;
import sofia.app.Screen;

/**
 *  Implements the controller for the CookerScreen.
 *
 *  @author Samuel Hentschel (samh95)
 *  @author Zheng Wang (zhengw8)
 *  @version 2015.04.24
 */
public class CookerScreen
    extends Screen
{
    private Restaurant restaurant;
    private LinearLayout todo;
    private LinearLayout inprocess;
    private ArrayListQueue<TextView> todoData;
    private ArrayListQueue<TextView> inprocessData;

    /**
     * Initializes a new CookerScreen object.
     * Loads all the food items that were ordered into the ToDo list, and all
     * the items currently being cooked into the In Process list.
     *
     * @param rest  The restaurant object being used by the application.
     */
    public void initialize(Restaurant rest)
    {
        restaurant = rest;
        setContentView(R.layout.cookerscreen);
        todo = (LinearLayout)this.findViewById(R.id.todo);
        inprocess = (LinearLayout)this.findViewById(R.id.inprocess);
        todoData = new ArrayListQueue<TextView>();
        inprocessData = new ArrayListQueue<TextView>();
        for (Table table: restaurant.getTables())
        {
            if (table != null)
            {
                for (Chair chair: table.getChairs())
                {
                    if (chair != null)
                    {
                        for (int i = 0; i < chair.getSize(); i++)
                        {
                            if (chair.getOrders()[i].getTimeStartedCooking() == 0)
                            {
                                todoData.enque(new TextView(this));
                                todoData.get(todoData.size()-1).setText(table.number() + " " +
                                    chair.number() + " " + i + " \n" + chair.getOrders()[i].getName());
                                todo.addView(todoData.get(todoData.size()-1));
                            }
                            else if (chair.getOrders()[i].getTimeFinishedCooking() == 0)
                            {
                                inprocessData.enque(new TextView(this));
                                inprocessData.get(inprocessData.size()-1).setText(table.number() + " " +
                                    chair.number() + " " + i + " \n" + chair.getOrders()[i].getName());
                                inprocess.addView(inprocessData.get(inprocessData.size()-1));                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Adds the FoodItem at the head of the ToDo ArrayListQueue to the tail of
     * the In Process ArrayListQueue.  Then updates the list.
     * Also sets the timeStartedCooking variable in the FoodItem object.
     */
    public void cookButtonClicked()
    {
        if(todoData.size() != 0)
        {
            String str = inprocessData.enque(todoData.deque()).getText().toString();
            int table = Integer.parseInt(str.substring(0, 2).trim());
            int chair = Integer.parseInt(str.substring(2, 4).trim());
            int order = Integer.parseInt(str.substring(4, 6).trim());
            restaurant.getTables()[table].getChairs()[chair].getOrders()[order].setTimeStartedCooking();

            changeList();
        }
    }

    /**
     * Removes the FoodItem at the head of the In Process ArrayListQueue and
     * updates the lists.
     * Also sets the timeFinishedCooking variable in the FoodItem object.
     */
    public void finishButtonClicked()
    {
        if(inprocessData.size() != 0)
        {
            String str = inprocessData.deque().getText().toString();
            int table = Integer.parseInt(str.substring(0, 2).trim());
            int chair = Integer.parseInt(str.substring(2, 4).trim());
            int order = Integer.parseInt(str.substring(4, 6).trim());
            restaurant.getTables()[table].getChairs()[chair].getOrders()[order].setTimeFinishedCooking();

            changeList();
        }
    }

    /**
     * Presents the MainScreen when the cookerToMenu button is pressed.
     */
    public void cookerToMenuClicked()
    {
        presentScreen(MainScreen.class, restaurant);
        finish();
    }

    /**
     * Updates the list with the current data held in the restaurant object.
     */
    public void changeList()
    {
        setContentView(R.layout.cookerscreen);
        todo = (LinearLayout)this.findViewById(R.id.todo);
        inprocess = (LinearLayout)this.findViewById(R.id.inprocess);
        todoData = new ArrayListQueue<TextView>();
        inprocessData = new ArrayListQueue<TextView>();
        for (Table table: restaurant.getTables())
        {
            if (table != null)
            {
                for (Chair chair: table.getChairs())
                {
                    if (chair != null)
                    {
                        for (int i = 0; i < chair.getSize(); i++)
                        {
                            if (chair.getOrders()[i].getTimeStartedCooking() == 0)
                            {
                                todoData.enque(new TextView(this));
                                todoData.get(todoData.size()-1).setText(table.number() + " " +
                                    chair.number() + " " + i + " \n" + chair.getOrders()[i].getName());
                                todo.addView(todoData.get(todoData.size()-1));
                            }
                            else if (chair.getOrders()[i].getTimeFinishedCooking() == 0)
                            {
                                inprocessData.enque(new TextView(this));
                                inprocessData.get(inprocessData.size()-1).setText(table.number() + " " +
                                    chair.number() + " " + i + " \n" + chair.getOrders()[i].getName());
                                inprocess.addView(inprocessData.get(inprocessData.size()-1));
                            }
                        }
                    }
                }
            }
        }
    }
}