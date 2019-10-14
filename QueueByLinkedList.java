package edu.QueueByLinkedList;

import java.util.*;

public class QueueByLinkedList implements java.util.Queue {
    private LinkedList queue;

    public void addToQueue(Object[] input) {
        for (Object o : input) {
            this.offer(o);
        }
    }

    public ArrayList<Object> getFromQueue() {
        ArrayList<Object> output = new ArrayList<Object>();
        while (!this.isEmpty()) {
            output.add(this.poll());
        }
        return output;
    }

    QueueByLinkedList() {
        queue = new LinkedList();
    }

    @Override
    public boolean add(Object o) {
        return this.queue.add(o);
    }


    @Override
    public boolean offer(Object o) {
        try {
            this.add(o);
        } catch (IllegalStateException e) {
            return false;
        }
        return true;
    }

    @Override
    public Object remove() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.queue.remove(0);
    }

    @Override
    public Object poll() {
        try {
            return this.remove();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public Object element() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.queue.get(0);
    }

    @Override
    public Object peek() {
        try {
            return this.element();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public int size() {
        return this.size();
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.queue.contains(o);
    }

    @Override
    public Iterator iterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new java.lang.UnsupportedOperationException();
    }
}
