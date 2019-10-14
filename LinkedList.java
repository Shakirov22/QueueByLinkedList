package edu.QueueByLinkedList;

import java.util.*;

public class LinkedList implements java.util.List {
    private int length;
    private Node nullNode;
    private Node lastNode;

    public void addToLinkedList(Object[] input) {
        for (Object o : input) {
            this.add(o);
        }
    }

    public ArrayList<Object> getFromLinkedList() {
        ArrayList<Object> output = new ArrayList<Object>();
        while (!this.isEmpty()) {
            output.add(this.remove(0));
        }
        return output;
    }

    LinkedList() {
        this.length = 0;
        this.nullNode = new Node(null);
        this.nullNode.setLeftNode(this.nullNode);
        this.lastNode = null;
    }

    LinkedList(Object[] input) {
        this.length = 0;
        this.nullNode = new Node(null);
        this.nullNode.setLeftNode(this.nullNode);
        this.lastNode = null;
        this.addToLinkedList(input);
    }

    private void addFirstNode(Object o) {
        this.lastNode = new Node(o, this.nullNode, null);
        this.nullNode.setRightNode(this.lastNode);
        this.length = 1;
    }

    private void addNotFirstNode(Object o) {
        this.lastNode.setRightNode(new Node(o, this.lastNode, null));
        this.lastNode = this.lastNode.getRightNode();
        this.length += 1;
    }

    private Node getNodeOnIndex(int index) {
        if ((index >= this.length) || (index < 0)) {
            throw new NoSuchElementException();
        } else {
            Node iteratorNode;
            if (index < this.length / 2) {
                iteratorNode = this.nullNode.getRightNode();
                for (int i = 0; i < index; i++) {
                    iteratorNode = iteratorNode.getRightNode();
                }
            } else {
                iteratorNode = this.lastNode;
                for (int i = this.length - 1; i > index; i--) {
                    iteratorNode = iteratorNode.getLeftNode();
                }
            }
            return iteratorNode;
        }
    }

    @Override
    public boolean add(Object o) {
        if (this.isEmpty()) {
            this.addFirstNode(o);
        } else {
            this.addNotFirstNode(o);
        }
        return true;
    }

    @Override
    public Object remove(int index) {
        if ((index >= this.length) || (index < 0)) {
            throw new NoSuchElementException();
        } else {
            Node removingNode = this.getNodeOnIndex(index);
            if (index == this.length) {
                this.lastNode = removingNode.getLeftNode();
            }
            this.length -= 1;
            return removingNode.removeNode();
        }
    }

    @Override
    public boolean contains(Object o) {
        Node iteratorNode = this.nullNode.getRightNode();
        while (iteratorNode != null) {
            if (iteratorNode.getObject().equals(o)) {
                return true;
            }
            iteratorNode = iteratorNode.getRightNode();
        }
        return false;
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public Object get(int index) {
        if ((index >= this.length) || (index < 0)) {
            throw new NoSuchElementException();
        } else {
            return this.getNodeOnIndex(index).getObject();
        }
    }

    @Override
    public void add(int index, Object element) {
        if ((index > this.length) || (index < 0)) {
            throw new NoSuchElementException();
        } else {
            if (index == this.length) {
                this.add(element);
            } else {
                Node changingNode = this.getNodeOnIndex(index);
                Node addingNode = new Node(element, changingNode.getLeftNode(), changingNode);
                changingNode.getLeftNode().setRightNode(addingNode);
                changingNode.setLeftNode(addingNode);
                this.length += 1;
            }
        }
    }

    @Override
    public boolean remove(Object o) {
        throw new java.lang.UnsupportedOperationException();
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
    public boolean addAll(Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public Object set(int index, Object element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
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
