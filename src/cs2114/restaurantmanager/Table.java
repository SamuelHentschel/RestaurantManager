package cs2114.restaurantmanager;

/**
 *  Creates a new Table which holds the Chairs and the specific Table time data.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 25, 2015
 */
class Table
{
    //Fields
    private long timeSeated;
    private int table;
    private int numChairs;
    private Chair[] chairs;
    private Bill[] bills;
    private int current;
    private long timePaid;
    private long timeBussed;

    //Constructors
    /**
     * Creates a new Table object with the specified amount of Chairs.
     *
     * @param tableNum  The number of the specific table.
     * @param chairs    The specified amount of chairs.
     */
    public Table(int tableNum, int chairs)
    {
        timeSeated = System.currentTimeMillis();
        table = tableNum;
        numChairs = chairs;
        this.chairs = new Chair[chairs];
        bills = new Bill[chairs];
        timePaid = 0;
        current =  0;
        timeBussed = 0;
    }

    /**
     * Creates a new Table object with the default number of Chairs (6).
     *
     * @param tableNum   The number of the specific table.
     */
    public Table(int tableNum)
    {
        this(tableNum, 6);
    }

    //Methods
    /**
     * Gets the number of Chairs at the Table.
     *
     * @return      Returns the number of Chairs at the Table.
     */
    public int getNumChairs()
    {
        return numChairs;
    }

    /**
     * Gets the array used to hold the Chairs at the Table.
     *
     * @return      Returns the Chairs at the Table.
     */
    public Chair[] getChairs()
    {
        return chairs;
    }

    /**
     * Gets the array used to hold the Bills being made for the table.
     *
     * @return      Returns the Bills for the table.
     */
    public Bill[] getBills()
    {
        return bills;
    }

    /**
     * Adds a Bill to the Bill array.
     *
     * @return  Returns the bill added to the array.
     */
    public Bill add(Bill bill)
    {
        bills[current] = bill;
        current++;
        return bill;
    }

    /**
     * Removes the specified Bill from the array.
     */
    public void remove(int b)
    {
        bills[b] = null;
    }

    /**
     * Gets the number of the table.
     *
     * @return      Returns the table number.
     */
    public int number()
    {
        return table;
    }

    /**
     * Returns the value of the time seated.
     *
     * @return  Returns the time the table was seated.
     */
    public long getTimeSeated()
    {
        return timeSeated;
    }

    /**
     * Sets the time all checks were paid for.
     */
    public void setTimePaid()
    {
        timePaid = System.currentTimeMillis();
    }

    /**
     * Returns the value of the time paid.
     *
     * @return      Returns the time all bills were paid.
     */
    public long getTimePaid()
    {
        return timePaid;
    }

    /**
     * Sets the time the Table was bussed.
     */
    public void setTimeBussed()
    {
        timeBussed = System.currentTimeMillis();
    }

    /**
     * Gets the time the Table was bussed.
     */
    public long getTimeBussed()
    {
        return timeBussed;
    }
}
