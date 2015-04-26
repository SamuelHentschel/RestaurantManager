package cs2114.restaurantmanager;

import android.view.View;
import android.widget.AdapterView;
import sofia.graphics.Color;
import android.graphics.RectF;
import sofia.app.Screen;
import android.widget.*;
import sofia.app.ScreenLayout;

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


        chair = restaurant.getTables()[tableNumber - 1].getChairs()[chairNumber - 1];

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
        TextView[] tv = new TextView[10];
        for (int i = 0; i < chair.getSize(); i++)
        {
            tv[i] = new TextView(this);
            tv[i].setText((i + 1) + " " + chair.getOrders()[i].getName());
            foodList.addView(tv[i]);
        }
        foodSpinner.setAdapter(adapter);
        chairNum.setText("Chair " + chairNumber);
    }
}
