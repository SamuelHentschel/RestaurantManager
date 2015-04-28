package cs2114.restaurantmanager;

import sofia.graphics.RectangleShape;

/**
 *  Creates a new TableTile object.
 *  It is a subclass of RectangleShape that is used to make coding the
 *  ServerScren easier.
 *
 *  @author Zheng Wang (zhengw8)
 *  @version 2015.04.27
 */
public class TableTile
    extends RectangleShape
{
    /**
     * Creates a new TableTile with the specified coordinates.
     *
     * @param left      The left coordinate of the shape.
     * @param top       The top coordinate of the shape.
     * @param right     The right coordinate of the shape.
     * @param bottom    The bottom coordinate of the shape.
     */
    public TableTile(float left, float top, float right, float bottom)
    {
        super(left, top, right, bottom);
        setImage("");
    }
}