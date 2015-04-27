package cs2114.restaurantmanager;

import android.widget.TextView;
import android.widget.LinearLayout;
import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

/**
 *  Implements the controller for the CookerScreen.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class CookerScreen
    extends Screen
{
    private Restaurant restaurant;
    private LinearLayout todo;
    private LinearLayout inprocess;
    ArrayListQueue<TextView> todoData;
    ArrayListQueue<TextView> inprocessData;

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

    public void cookerToMenuClicked()
    {
        presentScreen(MainScreen.class, restaurant);
        finish();
    }

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
