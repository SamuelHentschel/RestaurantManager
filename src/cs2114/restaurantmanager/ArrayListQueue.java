package cs2114.restaurantmanager;

import java.util.ArrayList;

/**
 *  Creates a new ArrayList that acts like a Queue.
 *  Its main use in the function is for the Cooker Screen where two
 *  ArrayListQueues are used to hold the food to be cooked and the food being
 *  cooked.
 *
 *  @param <E>  The type of object being passed into the ArrayListQueue.
 *
 *  @author Samuel Hentschel (samh95)
 *  @version 2014.04.27
 */
class ArrayListQueue<E>
{
    private ArrayList<E> list;

    /**
     * Creates a new ArrayListQueue of the specified type.
     */
    public ArrayListQueue()
    {
        list = new ArrayList<E>();
    }

    /**
     * Adds (enques) an item into the ArrayListQueue.
     *
     * @param item  The object being added into the array.
     *
     * @return      Returns the object being passed into the array.
     */
    public E enque(E item)
    {
        list.add(item);
        return item;
    }

    /**
     * Removes the first item in the ArrayListQueue.
     *
     * @return      Returns the object being removed from the front of the
     *              ArrayListQueue.
     */
    public E deque()
    {
        return list.remove(0);
    }

    /**
     * Gets and returns the object at the specified index of the ArrayListQueue.
     *
     * @param index The index of the item to be returned.
     *
     * @return      Returns the object at the specified index.
     */
    public E get(int index)
    {
        return list.get(index);
    }

    /**
     * Returns the size of the current ArrayListQueue.
     *
     * @return      Returns the current length of the ArrayListQueue.
     */
    public int size()
    {
        return list.size();
    }
}