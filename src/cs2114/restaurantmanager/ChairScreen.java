package cs2114.restaurantmanager;

import sofia.app.Screen;
import android.widget.*;

/**
 *  The controller for the chair screen which shows all the chairs that are in
 *  the table chosen.
 *
 *  @author Zheng Wang (zhengw8)
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
public class ChairScreen
    extends Screen
{
    private Restaurant             restaurant;
    private int                    tableNumber;
    private int                    chairNumber;

    private Chair                  chair;
    private Spinner                foodSpinner;
    private FoodItem               foodSelected;
    private LinearLayout           foodList;
    private TextView               chairNum;
    private ArrayAdapter<FoodItem> adapter;

    /**
     * Initializes a new ChairScreen object.
     * It shows the orders of the current chair and the stage of the process
     * they are in via color coding.  It also allows for the addition of food,
     * and the waiter/waitress to denote that they have delivered cooked food
     * via the Delivered button.
     *
     * @param rest      The restaurant object being used by the application.
     * @param tNum      The number of the current table.
     * @param cNum      The number of the current chair.
     */
    public void initialize(Restaurant rest, int tNum, int cNum)
    {
        //Load the position data.
        restaurant = rest;
        tableNumber = tNum;
        chairNumber = cNum;

        //If the chair hasn't been created, create it.
        if (restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1] == null)
        {
            restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1] = new Chair(chairNumber-1);
        }

        //Load the current chair for easier coding.
        chair = restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1];

        //Ovserve changes in the Chair class.
        chair.addObserver(this);

        //Create a Spinner
        FoodItem[] allOrder =
            new FoodItem[] { new BBQChickenPizza(), new BLT(),
                new ChickenParmesan(), new CocaCola(), new Coffee(),
                new Hamburger(), new HotDog(), new IcedTea(),
                new LemonZestChicken(), new Quesadilla(), new Salmon(),
                new Sprite(), new StirFriedBeef(), new Water(),
                new ZucchiniSquash() };

        adapter =
            new ArrayAdapter<FoodItem>(
                this,
                android.R.layout.simple_spinner_item,
                allOrder);

        adapter
            .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Prepares content for the screen of what has been ordered and color it
        //according to its place in the process.
        setContentView(R.layout.chairscreen);
        foodList = (LinearLayout)this.findViewById(R.id.foodList);
        TextView[] tv = new TextView[10];
        for (int i = 0; i < chair.getSize(); i++)
        {
            tv[i] = new TextView(this);
            tv[i].setText((i + 1) + " " + chair.getOrders()[i].getName());
            if (chair.getOrders()[i].getTimeDelivered() != 0)
            {
                tv[i].setTextColor(ProcessColor.DELIVERED);
            }
            else if (chair.getOrders()[i].getTimeFinishedCooking() != 0)
            {
                tv[i].setTextColor(ProcessColor.COOKED);
            }
            else if (chair.getOrders()[i].getTimeStartedCooking() != 0)
            {
                tv[i].setTextColor(ProcessColor.COOKING);
            }
            else
            {
                tv[i].setTextColor(ProcessColor.ORDERED);
            }
            foodList.addView(tv[i]);
        }

        //Adds it to the screen.
        foodSpinner.setAdapter(adapter);
        chairNum.setText("Chair " + chairNumber);
    }

    /**
     * Adds the FoodItem chosen from the spinner whent eh addFood button is
     * pressed.
     */
    public void addFoodClicked()
    {
        foodSelected = (FoodItem)foodSpinner.getSelectedItem();
        chair.add(foodSelected);
    }

    /**
     * Presents the previous TableScreen when the chairToTable button is
     * pressed.
     */
    public void chairToTableClicked()
    {
        presentScreen(TableScreen.class, restaurant, tableNumber);
        finish();
    }

    /**
     * Sets the timeDelivered variable if the food has been cooked.
     * It then calls change was observed, to update the screen.
     */
    public void deliveredButtonClicked()
    {
        for(int i = 0; i < restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1].getSize(); i++)
        {
            if (restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1].getOrders()[i].getTimeFinishedCooking() != 0)
            {
                restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1].getOrders()[i].setTimeDelivered();
            }
        }
        changeWasObserved(chair);
    }

    /**
     * When the screen observes change in the chair or is called it updates the
     * screen.
     *
     * @param other     The chair object that was hanged.
     */
    public void changeWasObserved(Chair other)
    {
        setContentView(R.layout.chairscreen);
        foodList = (LinearLayout)this.findViewById(R.id.foodList);
        TextView[] tv = new TextView[chair.getSize()];
        for (int i = 0; i < chair.getSize(); i++)
        {
            tv[i] = new TextView(this);
            tv[i].setText((i + 1) + " " + chair.getOrders()[i].getName());
            if (chair.getOrders()[i].getTimeDelivered() != 0)
            {
                tv[i].setTextColor(ProcessColor.DELIVERED);
            }
            else if (chair.getOrders()[i].getTimeFinishedCooking() != 0)
            {
                tv[i].setTextColor(ProcessColor.COOKED);
            }
            else if (chair.getOrders()[i].getTimeStartedCooking() != 0)
            {
                tv[i].setTextColor(ProcessColor.COOKING);
            }
            else
            {
                tv[i].setTextColor(ProcessColor.ORDERED);
            }
            foodList.addView(tv[i]);
        }
        foodSpinner.setAdapter(adapter);
        chairNum.setText("Chair " + chairNumber);
    }
}