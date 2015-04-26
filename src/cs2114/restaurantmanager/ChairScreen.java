package cs2114.restaurantmanager;

import sofia.app.Screen;
import android.widget.*;

/**
 *  The controller for the chair screen which shows all the chairs that are in
 *  the table chosen.
 *
 *  @author (LegitMe)
 *  @author Samuel Hentschel (samh95)
 *  @version 2014.04.24
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


    public void initialize(Restaurant rest, int tNum, int cNum)
    {
        restaurant = rest;
        tableNumber = tNum;
        chairNumber = cNum;

        if (restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1] == null)
        {
            restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1] = new Chair();
        }

        chair = restaurant.getTables()[tableNumber-1].getChairs()[chairNumber-1];

        chair.addObserver(this);

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

        foodSpinner.setAdapter(adapter);
        chairNum.setText("Chair " + chairNumber);

    }


    public void addFoodClicked()
    {
        foodSelected = (FoodItem)foodSpinner.getSelectedItem();
        chair.add(foodSelected);
    }


    public void chairToTableClicked()
    {
        presentScreen(TableScreen.class, restaurant, tableNumber);
        finish();
    }


    public void changeWasObserved(Chair other)
    {

        setContentView(R.layout.chairscreen);
        foodList = (LinearLayout)this.findViewById(R.id.foodList);
        TextView[] tv = new TextView[chair.getSize()];
        for (int i = 0; i < chair.getSize(); i++)
        {
            tv[i] = new TextView(this);
            tv[i].setText((i + 1) + " " + chair.getOrders()[i].getName());
            tv[i].setTextColor(ProcessColor.ORDERED);
            foodList.addView(tv[i]);
        }
        foodSpinner.setAdapter(adapter);
        chairNum.setText("Chair " + chairNumber);
    }
}
