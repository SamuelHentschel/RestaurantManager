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
    private int numChairs;
    private Chair[] chairs;
    private Bill[] bills;

    //Constructors
    /**
     * Creates a new Table object with the specified amount of Chairs.
     *
     * @param chairs    The specified amount of chairs.
     */
    public Table(int chairs)
    {
        numChairs = chairs;
        this.chairs = new Chair[chairs];
        bills = new Bill[chairs];
    }

    /**
     * Creates a new Table object with the default number of Chairs (4).
     */
    public Table()
    {
        this(4);
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
}
