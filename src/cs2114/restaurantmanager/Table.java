package cs2114.restaurantmanager;

/**
 *  Creates a new table which holds the chairs and the specific table time data.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version Mar 22, 2015
 */
class Table
{
    private int numChairs;
    private Chair[] chairs;
    private Bill[] bills;

    /**
     * Creates a new Table object with the specified amount of chairs.
     *
     * @param chairs    The specified amount of chairs.
     */
    public Table(int chairs)
    {
        this.numChairs = chairs;
        this.chairs = new Chair[chairs];
        this.bills = new Bill[chairs];
    }

    /**
     * Creates a new Table object with the default number of chairs: 4.
     */
    public Table()
    {
        this(4);
    }

    /**
     * Gets the number of chairs at the table.
     *
     * @return      Returns the number of chairs at a table.
     */
    public int getNumChairs()
    {
        return numChairs;
    }

    /**
     * Gets the array used to hold the chairs at the table.
     *
     * @return      Returns the chairs at the table.
     */
    public Chair[] getChairs()
    {
        return chairs;
    }

    /**
     * Gets the array used to hold the bills being made for the table.
     *
     * @return      Returns the bills for that table.
     */
    public Bill[] getBills()
    {
        return bills;
    }
}
