package AdapterPattern.EnumerationIterator;

import java.util.Enumeration;

public class Myenumeration<T> implements Enumeration<T> {
    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public T nextElement() {
        return null;
    }
}
