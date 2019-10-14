package edu.QueueByLinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class QueueByLinkedListTester {

    private void equalsArray(Object[] input, Object[] output) {
        assertEquals(input.length, output.length);
        for (int i = 0; i < output.length; i++) {
            assertEquals(input[i], output[i]);
        }
    }

    @Test
    public void testArray234() {
        Object input[] = {2, 3, 4};

        QueueByLinkedList queue = new QueueByLinkedList();
        queue.addToQueue(input);

        Object output[] = queue.getFromQueue().toArray();
        assertEquals(true, queue.isEmpty());

        equalsArray(input, output);
    }

    @Test
    public void testArray2P4() {
        Object input[] = {2, "P", 4};

        QueueByLinkedList queue = new QueueByLinkedList();
        queue.addToQueue(input);

        Object output[] = queue.getFromQueue().toArray();
        assertEquals(true, queue.isEmpty());

        equalsArray(input, output);
    }

    @Test
    public void testEmptyArray() {
        Object input[] = {};

        QueueByLinkedList queue = new QueueByLinkedList();
        queue.addToQueue(input);

        Object output[] = queue.getFromQueue().toArray();
        assertEquals(true, queue.isEmpty());

        equalsArray(input, output);
    }

    @Test
    public void testGetFromEmpty() {
        QueueByLinkedList queue = new QueueByLinkedList();

        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }
}
