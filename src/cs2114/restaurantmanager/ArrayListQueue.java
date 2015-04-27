package cs2114.restaurantmanager;

import java.util.ArrayList;

class ArrayListQueue<E>
{
    ArrayList<E> list;

    public ArrayListQueue()
    {
        list = new ArrayList<E>();
    }

    public E enque(E item)
    {
        list.add(item);
        return item;
    }

    public E deque()
    {
        return list.remove(0);
    }

    public E get(int index)
    {
        return list.get(index);
    }

    public int size()
    {
        return list.size();
    }
}
