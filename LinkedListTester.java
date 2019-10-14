package edu.QueueByLinkedList;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTester {

    private void equalsArray(Object[] input, Object[] output) {
        assertEquals(input.length, output.length);
        for (int i = 0; i < output.length; i++) {
            assertEquals(input[i], output[i]);
        }
    }

    @Test
    public void testArray234() {
        Object[] input = {2, 3, 4};

        LinkedList linkedList = new LinkedList(input);

        Object[] output = linkedList.getFromLinkedList().toArray();
        assertEquals(true, linkedList.isEmpty());

        equalsArray(input, output);
    }

    @Test
    public void testArray2P4() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        Object[] output = linkedList.getFromLinkedList().toArray();
        assertEquals(true, linkedList.isEmpty());

        equalsArray(input, output);
    }

    @Test
    public void testEmptyArray() {
        Object[] input = {};

        LinkedList linkedList = new LinkedList(input);

        Object[] output = linkedList.getFromLinkedList().toArray();
        assertEquals(true, linkedList.isEmpty());

        equalsArray(input, output);
    }

    @Test
    public void testArray2P4ContainsP() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        assertTrue(linkedList.contains("P"));
    }

    @Test
    public void testArray2P4Contains3() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        assertFalse(linkedList.contains(3));
    }

    @Test
    public void testArray2P4GetFromPosition1() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        assertEquals("P", linkedList.get(1));
    }

    @Test
    public void testArray2P4GetFromPosition3() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        assertThrows(NoSuchElementException.class, () -> linkedList.get(3));
    }

    @Test
    public void testArray2P4RemoveFromPosition1() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);
        linkedList.remove(1);

        Object output[] = linkedList.getFromLinkedList().toArray();
        Object[] expectedArray = {2, 4};

        equalsArray(expectedArray, output);
    }

    @Test
    public void testArray2P4RemoveFromPosition3() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        assertThrows(NoSuchElementException.class, () -> linkedList.get(3));
    }

    @Test
    public void testArray2P4Add9ToPosition1() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);
        linkedList.add(1, "test");

        Object output[] = linkedList.getFromLinkedList().toArray();
        Object[] expectedArray = {2, "test", "P", 4};

        equalsArray(expectedArray, output);
    }

    @Test
    public void testArray2P4Add9ToFirstPosition() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);
        linkedList.add(0, "test");

        Object output[] = linkedList.getFromLinkedList().toArray();
        Object[] expectedArray = {"test", 2, "P", 4};

        equalsArray(expectedArray, output);
    }

    @Test
    public void testArray2P4Add9ToLastPosition() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);
        linkedList.add(3, "test");

        Object output[] = linkedList.getFromLinkedList().toArray();
        Object[] expectedArray = {2, "P", 4, "test"};

        equalsArray(expectedArray, output);
    }

    @Test
    public void testArray2P4Add9ToPosition4() {
        Object[] input = {2, "P", 4};

        LinkedList linkedList = new LinkedList(input);

        assertThrows(NoSuchElementException.class, () -> linkedList.add(4, "15"));
    }


    @Test
    public void testGetFromEmpty() {
        QueueByLinkedList queue = new QueueByLinkedList();

        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }
}
