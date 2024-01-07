package IteratorPattern;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator{

    ArrayList<MenuItem> items;
    int position = 0;


    public PancakeMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items.size() - 1 > position  || items.get(position) == null;
    }

    @Override
    public Object next() {
            MenuItem item = items.get(position);
            position = position + 1;
            return item;
    }
}
