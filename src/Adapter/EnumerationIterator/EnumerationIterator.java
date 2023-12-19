package Adapter.EnumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<T> implements Iterator<Enumeration<T>> {
    Enumeration<T> myEnum;

    public EnumerationIterator(Enumeration<T> myEnum) {
        this.myEnum = myEnum;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Enumeration<T> next() {
        return null;
    }
}
