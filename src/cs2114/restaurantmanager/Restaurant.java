package cs2114.restaurantmanager;

import sofia.util.Observable;

/**
 *  Contains the array of tables being used for the application.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2015.04.24
 */
class Restaurant extends Observable
{
    private Table[] tables;

    /**
     * Initializes a new array of tables.
     */
    public Restaurant()
    {
        tables = new Table[20];
    }

    /**
     * Returns the array of tables.
     *
     * @return      Returns the array of tables.
     */
    public Table[] getTables()
    {
        return tables;
    }
}
