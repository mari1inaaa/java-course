package edu.hw3.Task8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class BackwardIterator<T> implements Iterator<T> {
    private List<T> elements;
    private int index;

    BackwardIterator(Collection<T> collection) {
        this.elements = new ArrayList<>(collection);
        this.index = elements.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements.get(index--);
    }
}
